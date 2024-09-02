import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

// Define the Encryptable interface
interface Encryptable {
    String encrypt(String data) throws Exception;
    String decrypt(String encryptedData) throws Exception;
}

// Implement the Encryptable interface in the AES class
class AES implements Encryptable {
    private SecretKey secretKey;

    // Constructor to generate the AES key
    public AES() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // AES key size
        this.secretKey = keyGen.generateKey();
    }

    // Implement the encrypt method using AES
    public String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Implement the decrypt method using AES
    public String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }
}

// Implement the Encryptable interface in the RSA class
class RSA implements Encryptable {
    private PublicKey publicKey;
    private PrivateKey privateKey;

    // Constructor to generate the RSA key pair
    public RSA() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048); // RSA key size
        KeyPair keyPair = keyGen.generateKeyPair();
        this.publicKey = keyPair.getPublic();
        this.privateKey = keyPair.getPrivate();
    }

    // Implement the encrypt method using RSA
    public String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Implement the decrypt method using RSA
    public String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }
}

// Main class to test the implementations
class Main {
    public static void main(String[] args) {
        try {
            // AES encryption/decryption example
            Encryptable aes = new AES();
            String aesEncrypted = aes.encrypt("Hello AES");
            String aesDecrypted = aes.decrypt(aesEncrypted);
            System.out.println("AES Encrypted: " + aesEncrypted);
            System.out.println("AES Decrypted: " + aesDecrypted);

            // RSA encryption/decryption example
            Encryptable rsa = new RSA();
            String rsaEncrypted = rsa.encrypt("Hello RSA");
            String rsaDecrypted = rsa.decrypt(rsaEncrypted);
            System.out.println("RSA Encrypted: " + rsaEncrypted);
            System.out.println("RSA Decrypted: " + rsaDecrypted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

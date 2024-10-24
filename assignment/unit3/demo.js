import React, { useState, useEffect } from 'react';
import { Canvas } from '@react-three/fiber';
import { useSpring, animated } from '@react-spring/three';
import { OrbitControls } from '@react-three/drei';

const ImageButton = ({ position, scale, color, onClick, isSelected }) => {
    const [hovered, setHovered] = useState(false);
    const props = useSpring({
        scale: isSelected ? [2.5, 2.5, 2.5] : scale,
        color: hovered ? null : color,
    });

    return (
        <animated.mesh
            position={position}
            scale={props.scale}
            onClick={onClick}
            onPointerOver={() => setHovered(true)}
            onPointerOut={() => setHovered(false)}
        >
            <boxGeometry args={[1, 1, 0.1]} />
            <animated.meshStandardMaterial color={props.color} />
        </animated.mesh>
    );
};

const ImageSelector = () => {
    const [images] = useState([
        { id: 1, color: 'red' },
        { id: 2, color: 'green' },
        { id: 3, color: 'blue' },
        { id: 4, color: 'yellow' },
        { id: 5, color: 'purple' },
    ]);
    const [selectedIndex, setSelectedIndex] = useState(0);

    const handleClick = (index) => {
        setSelectedIndex(index);
    };

    return (
        <Canvas camera={{ position: [0, 0, 0] }}>
            <OrbitControls enableZoom={false} enablePan={false} enableRotate={false} />
            {images.map((image, index) => {
                const offset = index - selectedIndex;
                const position = [offset * 20, 1, 0];
                const scale = offset === 0 ? [10, 10, 10] : [2, 2, 2];
                return (
                    <ImageButton
                        key={image.id}
                        position={position}
                        scale={scale}
                        color={image.color}
                        onClick={() => handleClick(index)}
                        isSelected={index === selectedIndex}
                    />
                );
            })}
        </Canvas>
    );
};

export default ImageSelector;

import CarouselHome from "../../components/CarouselHome/CarouselHome";
import AboutUs from "../../components/About Us/AboutUs";
import React from "react";

const Home: React.FC = () => {
  return (
    <div>
       {/* Ahora, añade los componentes CarouselHome y AboutUs */}
      <CarouselHome />
      <AboutUs />
    </div>
  );
};

export default Home;
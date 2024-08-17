import React from 'react';
import { Link } from 'react-router-dom';

function Header() {
  return (
    <header>
      <h2>Gestion Comptable et Financière</h2>
      <nav>
        <Link to="/">Accueil</Link> | <Link to="/about">À propos</Link>
      </nav>
    </header>
  );
}

export default Header;

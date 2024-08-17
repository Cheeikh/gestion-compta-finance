#!/bin/bash

# Définir le nom du projet
PROJECT_NAME="transaction-service"

# Créer la structure des dossiers
mkdir -p $PROJECT_NAME/src/main/java/com/example/transaction/{controller,model,repository,service}
mkdir -p $PROJECT_NAME/src/main/resources

# Créer les fichiers Java principaux
touch $PROJECT_NAME/src/main/java/com/example/transaction/TransactionServiceApplication.java
touch $PROJECT_NAME/src/main/java/com/example/transaction/controller/TransactionController.java
touch $PROJECT_NAME/src/main/java/com/example/transaction/model/Transaction.java
touch $PROJECT_NAME/src/main/java/com/example/transaction/repository/TransactionRepository.java
touch $PROJECT_NAME/src/main/java/com/example/transaction/service/TransactionService.java

# Créer le fichier de configuration application.properties
touch $PROJECT_NAME/src/main/resources/application.properties

# Créer le fichier pom.xml
touch $PROJECT_NAME/pom.xml

echo "La structure de projet $PROJECT_NAME a été créée avec succès."

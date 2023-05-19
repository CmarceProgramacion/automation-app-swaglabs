# `Automatización de pruebas apk SwagLabs`

#### Descripción

Proyecto de Automatización de pruebas movil de la apk Swaglabs con JAVA, Serenity BDD, Screemplay, Gradle, Appium y Android Studio.

#### Feature: Validate shopping cart

> **As** a user of Swaglabso

> **I** want to login and access the app

> **To** purchase online

#### Características del Proyecto

En la construcción del proyecto de automatización en la apk SwagLabs se implementa:

- Patrón de diseño de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle 7.
- Desarrollado en java en su versión 11

#### Versionado

| Repository       | Version |
|------------------|---------|
| Serenity         | 3.6.22  |
| SerenityCucumber | 3.6.22  |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 2.0.7   |

#### Precondiciones

- [x] 1: Instar Java en su versión 11.
- [x] 1.1: Configurar variable de entorno JAVA_HOME.
- [x] 2: Instar Gradle en su versión 7.X.
- [x] 2.1: Configurar variable de entorno GRADLE_HOME.
- [x] 3: Instalar Appium Server y ejecutarlo por default.
- [x] 4: Instalar emulador de Android v11.0 en Android Studio.
- [x] 5: Configurar capabilities en serenity.properties.
 
>- appium.hub=http://localhost:4723/wd/hub
>- appium.automationName=Appium
>- appium.platformName=Android
>- appium.platformVersion=11.0
>- appium.deviceName=emulator-5554

#### Ejecución del proyecto

Para la ejecución del proyecto se debe implementar el siguiente comando en el terminal del directorio raíz del
proyecto:

- si no tienes Gradle o una version menor que la 7.x.x, ejecuta el siguiente comando:

```sh
./gradlew clean test 
```

- si tienes gradle instalado y configurado puedes ejecutar el siguiente comando:

```sh
gradle clean test 
```
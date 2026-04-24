## Objetivo
Desarrollo de una aplicación de escritorio en Java usando NetBeans IDE que implemente un sistema de autenticación y un menú principal con dos módulos funcionales: Mantenimiento de Usuarios y Reinicio de Clave.

## Descripción
Aplicación de escritorio desarrollada en Java Swing que permite el acceso exclusivo a un módulo de gestión para el Administrador en el cual gestiona los usuarios para activarlos para acceso a Menu principal.

Al iniciar sesión como admin, el sistema despliega el `MenuGestion`, una ventana centralizada con las opciones principales para administrar el sistema.

## Funcionalidades actuales
1. **Login de acceso**: Valida las credenciales del administrador.
2. **MenuGestion**: Panel principal del administrador con fondo amarillo. Contiene:
   - **Mantenimiento Usuarios**: Acceso al CRUD de usuarios el administrador puede agregar, modificar, activar e inactivar usuarios.
   - **Reiniciar Clave**: Opción para reestablecer contraseñas de usuarios ya creados.
   - **Cerrar Sesión**: Cierra el MenuGestion y regresa al Login.

## Ejecucion por medio del usuario "admin"
1. Se ejecuta `LoginFrame`.
2. Usuario ingresa `admin` y la clave `1234`.
3. Sistema valida y cierra el Login.
4. Se abre `MenuGestion` con fondo amarillo.
5. El admin puede elegir una opción o cerrar sesión.

## Ejecucion por medio de usuarios normales
1. Se ejecuta `LoginFrame`.
2. Usuario ingresa por ejemplo `Luis` y clave `Clavesegura123!`.
3. Sistema valida y cierra el Login.
4. Se abre `MenuPrincipal` con fondo celeste palido.
5. El usuario puede elegir una opción o cerrar sesión.

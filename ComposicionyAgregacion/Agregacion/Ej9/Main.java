package ComposicionyAgregacion.Agregacion.Ej9;

public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto p1 = new Producto("Laptop", 1500.00);
        Producto p2 = new Producto("Mouse", 25.99);
        Producto p3 = new Producto("Teclado", 45.50);
        Producto p4 = new Producto("Monitor", 300.00);

        // Crear carrito de compras
        CarritoCompras carrito = new CarritoCompras();

        // Agregar productos (puedes probar con más de 10 si querés ver el límite)
        carrito.agregar_producto(p1);
        carrito.agregar_producto(p2);
        carrito.agregar_producto(p3);
        carrito.agregar_producto(p4);

        // Puedes probar el límite con un bucle si querés
        for (int i = 0; i < 8; i++) {
            carrito.agregar_producto(new Producto("ProductoExtra" + (i+1), 10));
        }

        // Mostrar carrito
        carrito.mostrar_carrito();
    }
}

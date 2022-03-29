public class main {
    public static void main(String[] args) {
        //Kiem Thu 2 tham so
        Point2D d = new Point2D();
        d.setX(2.5f);
        d.setY(5.6f);
        for (float e : d.getXY()){
            System.out.println(e);
        }

        Point2D d1 = new Point2D(10.2f, 20.0f);
        for (float e1 : d.getXY()) {
            System.out.println("(x,y)" + e1);
        }

        //Kiem thu 3 so

        Point3D point3D = new Point3D();
        point3D.setX(3.0f);
        point3D.setY(4.2f);
        point3D.setZ(5.6f);

        for (float t : point3D.getXYZ()){
            System.out.println("(x,y,z) = " + t);
        }

        Point3D a = new Point3D(5.3f,6.3f,8.5f);
        for (float t1 : a.getXYZ()){
            System.out.println("Duyet mang 3 phanTu " + t1);
        }
    }
}

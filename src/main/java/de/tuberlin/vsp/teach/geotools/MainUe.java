package de.tuberlin.vsp.teach.geotools;

import org.geotools.data.FeatureReader;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class MainUe {

        public static void main(String[] args) throws IOException {//throws IOException?

                final String pathname = "data/shapefiles/thueringen-kreise.shp";

                FileDataStore store = FileDataStoreFinder.getDataStore(new File(pathname));//FileDataStoreFinder大写 直接用类 不用对象调用函数

                FeatureReader<SimpleFeatureType, SimpleFeature> reader = store.getFeatureReader();

                List<SimpleFeature> features = new ArrayList<>();
                for (; reader.hasNext(); ) {//; reader.hasNext();可能是迭代器Iterator？

                        SimpleFeature result = reader.next();
                        features.add(result);
//                        System.out.println(result.toString());
//                        List<Object> attributes = result.getAttributes();//result.getAttributes()是一个数组?
//                        for (Object o : result.getAttributes()) {//result.getAttributes()是一个数组?|为何不用attributes代替result.getAttributes()？
//                                System.out.println(o.toString());
//                        }
                }

                reader.close();

                System.out.println(features.size());


                List<String> pointsString = new ArrayList<>();//输入坐标准备
                pointsString.add("x coord, y coord");//输入坐标第一行




/*//              Aufgabe 1: die Mittelpunkt von 23 Bundeslander zu finden
                for(SimpleFeature feature : features){
                        double minX = feature.getBounds().getMinX();
                        double maxX = feature.getBounds().getMaxX();
                        double minY = feature.getBounds().getMinY();
                        double maxY = feature.getBounds().getMaxY();
                        double xNew = (minX+maxX)/2;
                        double yNew = (minY+maxY)/2;

//                        X coord, Y coord
                        pointsString.add(xNew + "," + yNew);

//                        System.out.println(minX);
                }*/


//                Aufgabe 2: in jeden Landkreis 5 random BounderBox erstellen
                for(SimpleFeature feature : features){
                        double minX = feature.getBounds().getMinX();
                        double maxX = feature.getBounds().getMaxX();
                        double minY = feature.getBounds().getMinY();
                        double maxY = feature.getBounds().getMaxY();

                        for (int i = 0; i < 5; i++) {
                                double xNew = minX + (maxX-minX)*Math.random();
                                double yNew = minY + (maxY-minY)*Math.random();
                                pointsString.add(xNew + "," + yNew);
                        }

                }


                CSVTools.printCSV(pointsString, "data/coords.csv");




                //                Point point = new GeometryFactory().createPoint(new Coordinate(xNew, yNew));


/*                for (SimpleFeature feature : features) {
                        BoundingBox bounds = feature.getBounds();
                        Geometry polygon = (Geometry) feature.getAttributes().get(0);
                        DirectPosition directPosition = new DirectPosition1D();
                        if (polygon.contains(directPosition))
                }*/




        }
}
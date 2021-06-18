package RealLabHH;

import org.geotools.data.FeatureReader;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.shapefile.shp.ShapefileWriter;

import org.geotools.geometry.jts.JTSFactoryFinder;
import org.geotools.geometry.jts.WKTWriter2;
import org.geotools.measure.Measure;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.locationtech.jts.algorithm.Length;
import org.locationtech.jts.geom.*;
import org.locationtech.jts.io.WKTReader;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.geometry.BoundingBox;
import si.uom.NonSI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.locationtech.jts.util.GeometricShapeFactory;
//import org.matsim.core.utils.gis.ShapeFileWriter;
import org.geotools.geometry.GeometryBuilder;
//import org.geotools.geometry.jts;

class Main {

        public static void main( String[] args ) throws IOException{

        /*final String pathname = "data/shapefiles/thueringen-kreise.shp";

                FileDataStore store = FileDataStoreFinder.getDataStore( new File( pathname ) );

                FeatureReader<SimpleFeatureType, SimpleFeature> reader = store.getFeatureReader();

                List<SimpleFeature> features = new ArrayList<>();
                for ( ; reader.hasNext(); ) {
                        SimpleFeature result = reader.next();
                        features.add(  result );
                }

                reader.close();

                for( SimpleFeature feature : features ){
                        BoundingBox bounds = feature.getBounds();
                        Geometry polygon = (Geometry) feature.getAttributes().get( 0 );
                }

                SimpleFeature aLandkreis = features.get(0);
                BoundingBox bb = aLandkreis.getBounds();
                Geometry polygon = (Geometry) aLandkreis.getAttributes().get( 0 );

                final GeometryFactory gf = JTSFactoryFinder.getGeometryFactory();
                FileWriter out = new FileWriter( new File( "/Users/kainagel/out2.csv" ) );
                out.write( "X;Y\n" );
                for ( int ii=0 ; ii<1000 ; ii++ ) {
                        double xx = bb.getMinX() + Math.random() * ( bb.getMaxX() - bb.getMinX() );
                        double yy = bb.getMinY() + Math.random() * ( bb.getMaxY() - bb.getMinY() );
                        final Point point = gf.createPoint( new Coordinate( xx, yy ) );
                        if ( polygon.contains( point ) ){
                                out.write( xx + ";" + yy + ";\n" );
                        }
                }
                out.close();*/




                //final GeometryFactory gf = JTSFactoryFinder.getGeometryFactory();
                //final GeometryShapeFactory gf = new GeometricShapeFactory();




                /*final Point point = gf.createPoint( new Coordinate( 556810.114452, 5928984.932974 ) );
                Geometry buffer = point.buffer(2000);*/


                //Measure<Double, Length> dist = Measure.valueOf(50.0, SI.KILOMETER);
                //Measure<Double, Length> dist = Measure.valueOf(1.0, NonSI.MILE);
                //GeometryFactory gf = new GeometryFactory();
                /*Point p = gf.createPoint(new Coordinate(556810.114452, 5928984.932974));
                buf.bufferPoint(2000, DefaultGeographicCRS.WGS84, p);*/



                /*GeometryBuilder geometryBuilder = new GeometryBuilder(DefaultGeographicCRS.WGS84);
                Polygon circle = geometryBuilder.circle(
                        myLong,
                        myLat,
                        radiusInMeters, 10);*/



                /*                WKTWriter2 writer = new WKTWriter2(2);
                //    src/main/java/RealLabHH/test.shp
                writer.write(buffer);*/
                //ShapefileFeatureWriter

                //MATSim的ShapeFileWriter
                //ShapeFileWriter



                //Geometry linearRing = gf.createLinearRing();





    }
}

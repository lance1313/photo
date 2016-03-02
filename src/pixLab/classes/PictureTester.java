package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture arch = new Picture("arch.jpg");
	  
	  arch.explore();
  }
  public static void testKeepOnlyRed()
  {
	  Picture arch = new Picture("arch.jpg");
	  
	  arch.explore();

  }
  public static void testKeepOnlyGreen()
  {
	  Picture arch = new Picture("arch.jpg");
	  
	  arch.explore();
	  
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.mirrorVertical();
	  gull.explore();
	  
  }
  
  public static void tetMirrorHorizontal()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.mirrorHorizontal();
	  gull.explore();
	  
  }
  
  public static void testRandomColor()
  {
	  Picture  randomCat = new Picture("caterpiller.jpg");
	  randomCat.randomColor();
	  randomCat.explore();
	  
	  
  }
  
  public static void testMirrorArms()
  {
	  Picture arms = new Picture("snowman.jpg");
	  arms.mirrorArms();
	  arms.explore();
	  
  }
  
  public static void testCopy()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.mirrorHorizontal();
	  gull.explore();
	  
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture gull = new Picture("beach.jpg");
	  gull.mirrorDiagnal();
	  gull.explore();
	  
  }
  
  public static void testEdgeDetection2()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.edgeDetection2(10);
	  gull.explore();
	  
  }
  
  public static void testNegate()
  {
	  
	  Picture gull = new Picture("seagull.jpg");
	  gull.negate();
	  gull.explore();
  	
  }
  
  public static void testGrayScale()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.grayScale(0);
	  gull.explore();
  }
  
  /** Main method
   *  for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    testKeepOnlyRed();
    testKeepOnlyGreen();
    testNegate();
    testGrayScale();
   // testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testRandomColor();
	 tetMirrorHorizontal();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
    testCollage();
    testCopy();
    testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }


}
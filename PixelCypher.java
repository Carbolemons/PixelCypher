import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.math3.random.MersenneTwister;

/*
// ---------------------------------
// -------- BY: CARBOLEMONS ---------
// ---- PIXELCYPHER 2019 JAVA EDITION ---------
// ------- CARBOLEMONS THINGS ----------
// ------------------------------
/*
------------------------------------------------------------------
Carbolemons#0001 ~ Carbolemons.com ~ https://github.com/Carbolemons
// original idea from 2017 project of mine done in c++
// Convert any valid ASCII string to binary byte information and stuff it into the color array of a basic bitmap file
------------------------------------------------------------------
*/

public class PixelCypher {
	private static boolean pxc_etoss;
	private static boolean pxc_EOToss;
	private static ArrayList<Character> pxc_usrinp;
	private static ArrayList<Integer> pxc_rdbmp;
	
	private static int PRNG(int x){
		org.apache.commons.math3.random.RandomGenerator rng = new org.apache.commons.math3.random.MersenneTwister(System.currentTimeMillis() + x + ((int)Math.random() * 256));
		int prng = Math.abs(rng.nextInt() % 255);
		return prng;	
	}
	/*
	bitmap information
	
	byte header_info[13];
	int extrabytes
	int paddedsize
	int offset
	int x, y, n;
	int r, g, b;
	extrabytes = 4 - ((WIDTH * 3) % 4);
	if (extrabytes == 4) extrabytes = 0;
	paddedsize = ((WIDTH * 3) + extrabytes) * HEIGHT;
	offset = 54;
	
	//header information//
	header_info[0] = paddedsize + offset; //filesize
	header_info[1] = 0; 				  //reserved
	header_info[2] = offset;			  //offset of pixel array
	//DIB information - headers//
	header_info[3] = 40; 				  //size of dib
	header_info[4] = WIDTH; 			  //width of image
	header_info[5] = HEIGHT;			  //height of image
	header_info[6] = 0;					  //reserved
	header_info[7] = 0;					  //image compression (0 = BI_RGB)
	header_info[8] = paddedsize; 		  //size of image
	header_info[9] = 0;					  //horizontal resolution (DPI)
	header_info[10]= 0;					  //vertical resolution
	header_info[11]= 0; 				  //color pallette
	header_info[12]= 0;					  //important colors
	
	open new binary file with "BM" as bytes
	
	for(int x = 0; x <= 2; x++){ // this would be the main header information printed in proper indy format
		header_info[x] & 0x000000FF
		header_info[x] & 0x0000FF00 >> 8
		header_info[x] & 0x00FF0000 >> 16
		header_info[x] & 0xFF000000 >> 24 (this must be unsigned!!! so, long i guess?)
	}
	for(int x = 3; x <= 5; x++){ // this would be the DIB header information printed in proper indy format
		header_info[x] & 0x000000FF
		header_info[x] & 0x0000FF00 >> 8
		header_info[x] & 0x00FF0000 >> 16
		header_info[x] & 0xFF000000 >> 24 (this must be unsigned!!! so, long i guess?)
	}
	// binary write
	1 	//color plane
	0
	24 	//bits per pixel
	0
	for(int x = 7; x <= 12; x++){ // this would finish the DIB info
		header_info[x] & 0x000000FF
		header_info[x] & 0x0000FF00 >> 8
		header_info[x] & 0x00FF0000 >> 16
		header_info[x] & 0xFF000000 >> 24 (this must be unsigned!!! so, long i guess?)
	}
	
	then write pixel array in bgr format
	
	
	*/
	private static int read_bmp(){
		
	}
	
	private static void read_bmp(){
		
	}
	
	
	public static void main(String[] args){
		
	}
}
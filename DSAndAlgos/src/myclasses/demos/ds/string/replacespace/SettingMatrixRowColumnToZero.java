package myclasses.demos.ds.string.replacespace;

import java.util.Arrays;

public class SettingMatrixRowColumnToZero {
	public int[][] iArray = {{1, 2, 3, 4}, {5, 6, 7, 0}, {9, 10, 11, 12}, {0, 14, 15, 16}};
public int[][] fArray  = new int[4][4];
	public void settingElementsToZero() {
		System.out.println("Inside settingElementsToZero");
		populateArray();
		short[] rows =new short[iArray.length];
		short[] col = new short[iArray[0].length];
		
		for(int i=0;i<iArray.length;i++){
			for(int j=0;j<iArray.length;j++){
				if(iArray[i][j]==0){
					rows[i]=1;
					col[j]=1;
				}
			}
		}
		
		for(int k=0;k<rows.length;k++){
			for(int l=0;l<col.length;l++){
				if(rows[k]==1 ||col[l]==1){
					iArray[k][l]=0;
				}
			}
		}
		
		
		System.out.println("2D Array: " + Arrays.deepToString(iArray));
	}


	/**
	 * Populate 2D array.
	 */
	private void populateArray() {
		// TODO Auto-generated method stub
		System.out.println("leng " + iArray.length);
		for (int i = 0; i < iArray.length; i++) {
			for (int j = 0; j < iArray.length; j++) {
				fArray[i][j] = 1;
			}
		}
	}
	public static void main(String[] args) {
		SettingMatrixRowColumnToZero setZero = new SettingMatrixRowColumnToZero();
		setZero.settingElementsToZero();
	}
	
	
}

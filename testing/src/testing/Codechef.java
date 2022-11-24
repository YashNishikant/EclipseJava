package testing;

class Codechef {

	static int t = 4;

	static boolean pathExists(int w, int h, int[][] arr) {

		int t = w;

		boolean goback = true;
		boolean noneahead = true;
		
		
		int[][] spacegrid = new int[t][3 + 1];

		int posX = 0;
		int posY = 0;

		for (int i = 0; i < spacegrid.length; i++) {
			for (int j = 0; j < spacegrid[0].length; j++) {

				for (int k = 0; k < arr.length; k++) {
					System.out.println(arr[k][0] + " " + j + " | " + arr[k][1] + " " + i);
					if (arr[k][1] == j && arr[k][0] == 0 && goback) {
						noneahead = true;
						for (int l = i + 1; l < arr.length; l++) {
							try {
								if (arr[k][2] == arr[l][2]) {
									j = arr[l][0];
									i = arr[l][1];
									goback = false;
									noneahead = false;
									break;
								}
							} catch (Exception e) {
								noneahead = true;
								break;
							}
						}
						
						if(noneahead) {
							return false;
						}
						
						posX = i;
						posY = j;
					} else {
						if (posX > spacegrid.length - 1) {
							posX = 0;
							posY++;
						} else {
							posX++;
						}

						if (posY == h - 1 && posX == w - 1) {
							return true;
						}
						goback = true;
						break;
					}
				}
			}
		}
		return false;
	}

	public static boolean portalPrevious(int[][] spacegrid, int[][] arr, int x) {

		for (int k = 0; k < arr.length; k++) {
			if (arr[k][2] == arr[x][2] && k < x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		int w = 2;
		int h = 2;

		int[][] arr = new int[w][h];

		arr[0] = new int[] { 0, 1, 0 };

		System.out.println("final: " + pathExists(w, h, arr));

	}
}
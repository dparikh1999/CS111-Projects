public class TVGuide {
	public static void main(String[] args) {
		int[] channels = {2,4,5,7,9,11,13};
		String[] networks = {"CBS", "NBC", "FOX", "ABC", "My9", "CW", "PBS"};
		System.out.println(networkLookup(IO.readInt(), channels, networks));
	}
	public static String networkLookup (int chan, int[] chans, String[] nets) {
		for (int i=0; i<chans.length; i++) {
			if (chan==chans[i]) {
				return nets[i];
			}
		}
		return "Error: Channel not found!";
	}
	
	public static int channelLookup (String net, int[] chans, String[] nets) {
		for (int i=0; i<nets.length; i++) {
			if (net.equals(nets[i])) {
				return chans[i];
			}
		}
		return -1;
}
}

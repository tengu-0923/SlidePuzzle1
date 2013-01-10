package jp.co.teng.android.slidepazzle1;

/**
 * 駒の位置を保持するクラス
 */
public class Piece {
	private int     orgPlace;  // 完成時の位置
	private int     curPlace;  // 現在のY位置
	private boolean removed;   // 外された駒ならtrue

	public Piece(int place) {
		orgPlace  = place;
		curPlace  = place;
		removed   = false;
	}

	public boolean isEqual(Piece p) {
		if (this.orgPlace == p.getOrgPlace()) {
			return true;
		}
		return false;
	}

	public void set(Piece p) {
		curPlace = p.getCurPlace();
		removed  = p.getRemoved();
	}

	public void reset() {
		curPlace = orgPlace;
		removed  = false;
	}

	public int getOrgPlace() {
		return orgPlace;
	}

	public int getCurPlace() {
		return curPlace;
	}

	public void setCurPlace(int p) {
		curPlace = p;
	}

	public boolean getRemoved() {
		return removed;
	}

	public void setRemoved(boolean r) {
		removed = r;
	}
};
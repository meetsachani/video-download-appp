package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState;
import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class PG implements Parcelable.ClassLoaderCreator<AbsSavedState> {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{C8077mf.A, C8077mf.C, C8077mf.x, 9, C8077mf.z, -9, C8077mf.B, 5, C8077mf.B, 9, -60, 17, C8077mf.C, C8077mf.A, C8077mf.B, -60, 6, 9, -60, C8077mf.u, C8077mf.C, C8077mf.r, C8077mf.r};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final AbsSavedState createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: A01 */
    public final AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Parcelable superState = parcel.readParcelable(classLoader);
        if (superState == null) {
            return AbsSavedState.A02;
        }
        throw new IllegalStateException(A02(0, 23, 86));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A04 */
    public final AbsSavedState[] newArray(int i) {
        return new AbsSavedState[i];
    }
}

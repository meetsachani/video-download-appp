package o;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

@Deprecated
/* renamed from: o.kS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7527kS {
    public static final String a = "c";

    public AbstractC5317bO0<C7284jS> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return C8855pr.d(C7284jS.Q1, (ArrayList) C9542sf.g(readBundle.getParcelableArrayList("c")));
    }
}

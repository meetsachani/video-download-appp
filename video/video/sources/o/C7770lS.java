package o;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: o.lS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7770lS {
    public byte[] a(List<C7284jS> list) {
        ArrayList<Bundle> i = C8855pr.i(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", i);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}

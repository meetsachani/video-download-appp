package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: o.Va2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4484Va2 extends AbstractC4193Sa2 {
    public static final Parcelable.Creator<C4484Va2> CREATOR = new a();

    /* renamed from: o.Va2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C4484Va2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4484Va2 createFromParcel(Parcel parcel) {
            return new C4484Va2();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4484Va2[] newArray(int i) {
            return new C4484Va2[i];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}

package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: o.lJ2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7737lJ2 extends C7494kJ2 {
    public static final Parcelable.Creator<C7737lJ2> CREATOR = new a();

    /* renamed from: o.lJ2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C7737lJ2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7737lJ2 createFromParcel(Parcel parcel) {
            return new C7737lJ2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7737lJ2[] newArray(int i) {
            return new C7737lJ2[i];
        }
    }

    public C7737lJ2(String str, String str2) {
        super(str, str2);
    }

    public C7737lJ2(Parcel parcel) {
        super(parcel);
    }
}

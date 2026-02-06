package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Cy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2707Cy1 extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<C2707Cy1> CREATOR = new a();

    /* renamed from: o.Cy1$a */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<C2707Cy1> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public C2707Cy1 createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            int readInt = parcel.readInt();
            C2707Cy1 c2707Cy1 = new C2707Cy1(readInt);
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i = 0; i < readInt; i++) {
                c2707Cy1.put(iArr[i], iArr2[i]);
            }
            return c2707Cy1;
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public C2707Cy1[] newArray(int i) {
            return new C2707Cy1[i];
        }
    }

    public C2707Cy1() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            iArr2[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    public C2707Cy1(int i) {
        super(i);
    }

    public C2707Cy1(@InterfaceC5670cr1 SparseIntArray sparseIntArray) {
        for (int i = 0; i < sparseIntArray.size(); i++) {
            put(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
    }
}

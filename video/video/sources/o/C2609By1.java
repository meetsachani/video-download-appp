package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.By1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2609By1 extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<C2609By1> CREATOR = new a();

    /* renamed from: o.By1$a */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<C2609By1> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public C2609By1 createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            int readInt = parcel.readInt();
            C2609By1 c2609By1 = new C2609By1(readInt);
            int[] iArr = new int[readInt];
            boolean[] zArr = new boolean[readInt];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i = 0; i < readInt; i++) {
                c2609By1.put(iArr[i], zArr[i]);
            }
            return c2609By1;
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public C2609By1[] newArray(int i) {
            return new C2609By1[i];
        }
    }

    public C2609By1() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            zArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }

    public C2609By1(int i) {
        super(i);
    }

    public C2609By1(@InterfaceC5670cr1 SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            put(sparseBooleanArray.keyAt(i), sparseBooleanArray.valueAt(i));
        }
    }
}

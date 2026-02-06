package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Ay1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2511Ay1 extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C2511Ay1> CREATOR = new a();

    /* renamed from: o.Ay1$a */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.ClassLoaderCreator<C2511Ay1> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC11300zs1
        /* renamed from: a */
        public C2511Ay1 createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            return new C2511Ay1(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @InterfaceC5670cr1
        /* renamed from: b */
        public C2511Ay1 createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            return new C2511Ay1(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: c */
        public C2511Ay1[] newArray(int i) {
            return new C2511Ay1[i];
        }
    }

    public C2511Ay1() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public C2511Ay1(@InterfaceC5670cr1 Parcel parcel, @InterfaceC11300zs1 ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }
}

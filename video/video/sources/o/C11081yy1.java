package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: o.yy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11081yy1 {

    /* renamed from: o.yy1$a */
    /* loaded from: classes.dex */
    public static class a<T> implements Parcelable.ClassLoaderCreator<T> {
        public final InterfaceC11324zy1<T> a;

        public a(InterfaceC11324zy1<T> interfaceC11324zy1) {
            this.a = interfaceC11324zy1;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(InterfaceC11324zy1<T> interfaceC11324zy1) {
        return new a(interfaceC11324zy1);
    }
}

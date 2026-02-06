package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.common.zzag;
import java.util.ArrayList;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <T extends SafeParcelable> T a(@InterfaceC5670cr1 byte[] bArr, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        Preconditions.r(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static <T extends SafeParcelable> T b(@InterfaceC5670cr1 Intent intent, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <T extends SafeParcelable> T c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        return (T) a(Base64Utils.b(str), creator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11300zs1
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> d(@InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(a((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> e(@InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        return f(bundle.getByteArray(str), creator);
    }

    @InterfaceC11300zs1
    public static <T extends SafeParcelable> ArrayList<T> f(@InterfaceC11300zs1 byte[] bArr, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11300zs1
    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> g(@InterfaceC5670cr1 Intent intent, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(a((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> h(@InterfaceC5670cr1 Intent intent, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        return f(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void i(@InterfaceC5670cr1 Iterable<T> iterable, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 String str) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(m(t));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends SafeParcelable> void j(@InterfaceC5670cr1 Iterable<T> iterable, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 String str) {
        bundle.putByteArray(str, p(iterable));
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> void k(@InterfaceC5670cr1 Iterable<T> iterable, @InterfaceC5670cr1 Intent intent, @InterfaceC5670cr1 String str) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(m(t));
        }
        intent.putExtra(str, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void l(@InterfaceC5670cr1 Iterable<T> iterable, @InterfaceC5670cr1 Intent intent, @InterfaceC5670cr1 String str) {
        intent.putExtra(str, p(iterable));
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <T extends SafeParcelable> byte[] m(@InterfaceC5670cr1 T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void n(@InterfaceC5670cr1 T t, @InterfaceC5670cr1 Intent intent, @InterfaceC5670cr1 String str) {
        intent.putExtra(str, m(t));
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <T extends SafeParcelable> String o(@InterfaceC5670cr1 T t) {
        return Base64Utils.e(m(t));
    }

    public static byte[] p(Iterable iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(zzag.r(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}

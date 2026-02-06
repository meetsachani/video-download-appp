package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    public static final String[] Z = {"data"};
    public final Parcelable.Creator<T> Y;

    @KeepForSdk
    public DataBufferSafeParcelable(@InterfaceC5670cr1 DataHolder dataHolder, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.Y = creator;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void d(@InterfaceC5670cr1 DataHolder.Builder builder, @InterfaceC5670cr1 T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", obtain.marshall());
        builder.c(contentValues);
        obtain.recycle();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static DataHolder.Builder f() {
        return DataHolder.m0(Z);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @InterfaceC5670cr1
    @KeepForSdk
    /* renamed from: h */
    public T get(int i) {
        DataHolder dataHolder = (DataHolder) Preconditions.r(this.X);
        byte[] G0 = dataHolder.G0("data", i, dataHolder.U0(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(G0, 0, G0.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.Y.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}

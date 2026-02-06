package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@SafeParcelable.Class(creator = "LargeParcelTeleporterCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvj> CREATOR = new zzbvk();
    @SafeParcelable.Field(id = 2)
    public ParcelFileDescriptor X;
    public Parcelable Y = null;
    public boolean Z = true;

    @SafeParcelable.Constructor
    public zzbvj(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.X = parcelFileDescriptor;
    }

    public final SafeParcelable m0(Parcelable.Creator creator) {
        if (this.Z) {
            if (this.X == null) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.X));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    IOUtils.b(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.Y = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.Z = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    IOUtils.b(dataInputStream);
                    throw th2;
                }
            } catch (IOException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Could not read from parcel file descriptor", e);
                IOUtils.b(dataInputStream);
                return null;
            }
        }
        return (SafeParcelable) this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.X == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.Y.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvi
                            @Override // java.lang.Runnable
                            public final void run() {
                                Parcelable.Creator<zzbvj> creator = zzbvj.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = marshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            IOUtils.b(dataOutputStream2);
                                        } catch (IOException e) {
                                            e = e;
                                            dataOutputStream = dataOutputStream2;
                                            int i2 = com.google.android.gms.ads.internal.util.zze.b;
                                            com.google.android.gms.ads.internal.util.client.zzo.e("Error transporting the ad response", e);
                                            com.google.android.gms.ads.internal.zzv.t().x(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                IOUtils.b(outputStream);
                                            } else {
                                                IOUtils.b(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                IOUtils.b(outputStream);
                                            } else {
                                                IOUtils.b(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            }
                        });
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e) {
                        e = e;
                        int i2 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("Error transporting the ad response", e);
                        com.google.android.gms.ads.internal.zzv.t().x(e, "LargeParcelTeleporter.pipeData.2");
                        IOUtils.b(autoCloseOutputStream);
                        this.X = parcelFileDescriptor;
                        int a = SafeParcelWriter.a(parcel);
                        SafeParcelWriter.S(parcel, 2, this.X, i, false);
                        SafeParcelWriter.b(parcel, a);
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.X = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.S(parcel, 2, this.X, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}

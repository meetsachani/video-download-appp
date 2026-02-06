package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
/* loaded from: classes2.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 2)
    public ParcelFileDescriptor Y;
    @InterfaceC11300zs1
    public Bitmap Y0;
    @SafeParcelable.Field(id = 3)
    public final int Z;
    public boolean Z0;
    public File a1;

    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) int i2) {
        this.X = i;
        this.Y = parcelFileDescriptor;
        this.Z = i2;
        this.Y0 = null;
        this.Z0 = false;
    }

    public static final void E0(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    @KeepForSdk
    public void B0(@InterfaceC5670cr1 File file) {
        if (file != null) {
            this.a1 = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }

    @KeepForSdk
    public void g() {
        if (!this.Z0) {
            try {
                ((ParcelFileDescriptor) Preconditions.r(this.Y)).close();
            } catch (IOException e) {
                Log.w("BitmapTeleporter", "Could not close PFD", e);
            }
        }
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Bitmap m0() {
        if (!this.Z0) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.r(this.Y)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int readInt = dataInputStream.readInt();
                    int readInt2 = dataInputStream.readInt();
                    Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    E0(dataInputStream);
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                    createBitmap.copyPixelsFromBuffer(wrap);
                    this.Y0 = createBitmap;
                    this.Z0 = true;
                } catch (IOException e) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (Throwable th) {
                E0(dataInputStream);
                throw th;
            }
        }
        return this.Y0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        if (this.Y == null) {
            Bitmap bitmap = (Bitmap) Preconditions.r(this.Y0);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.a1;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.Y = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                            } catch (IOException e) {
                                throw new IllegalStateException("Could not write into unlinked file", e);
                            }
                        } finally {
                            E0(dataOutputStream);
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.S(parcel, 2, this.Y, i | 1, false);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.b(parcel, a);
        this.Y = null;
    }

    @KeepForSdk
    public BitmapTeleporter(@InterfaceC5670cr1 Bitmap bitmap) {
        this.X = 1;
        this.Y = null;
        this.Z = 0;
        this.Y0 = bitmap;
        this.Z0 = true;
    }
}

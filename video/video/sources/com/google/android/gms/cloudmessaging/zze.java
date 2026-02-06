package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zze implements Parcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzc();
    public Messenger X;
    public IMessengerCompat Y;

    public zze(IBinder iBinder) {
        this.X = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.X;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.Y.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.X;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.Y.b5(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((zze) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.X;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.Y.asBinder());
        }
    }
}

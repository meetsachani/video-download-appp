package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import o.InterfaceC8734pL0;

/* loaded from: classes.dex */
public class XT1 implements Parcelable {
    public static final Parcelable.Creator<XT1> CREATOR = new a();
    public final boolean X;
    public final Handler Y;
    public InterfaceC8734pL0 Z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<XT1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public XT1 createFromParcel(Parcel parcel) {
            return new XT1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public XT1[] newArray(int i) {
            return new XT1[i];
        }
    }

    /* loaded from: classes.dex */
    public class b extends InterfaceC8734pL0.b {
        public b() {
        }

        @Override // o.InterfaceC8734pL0
        public void P0(int i, Bundle bundle) {
            XT1 xt1 = XT1.this;
            Handler handler = xt1.Y;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                xt1.a(i, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final int X;
        public final Bundle Y;

        public c(int i, Bundle bundle) {
            this.X = i;
            this.Y = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            XT1.this.a(this.X, this.Y);
        }
    }

    public XT1(Handler handler) {
        this.X = true;
        this.Y = handler;
    }

    public void b(int i, Bundle bundle) {
        if (this.X) {
            Handler handler = this.Y;
            if (handler != null) {
                handler.post(new c(i, bundle));
                return;
            } else {
                a(i, bundle);
                return;
            }
        }
        InterfaceC8734pL0 interfaceC8734pL0 = this.Z;
        if (interfaceC8734pL0 != null) {
            try {
                interfaceC8734pL0.P0(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.Z == null) {
                    this.Z = new b();
                }
                parcel.writeStrongBinder(this.Z.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public XT1(Parcel parcel) {
        this.X = false;
        this.Y = null;
        this.Z = InterfaceC8734pL0.b.O0(parcel.readStrongBinder());
    }

    public void a(int i, Bundle bundle) {
    }
}

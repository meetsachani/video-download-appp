package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: o.bJ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5297bJ0 extends IInterface {
    public static final String M = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* renamed from: o.bJ0$c */
    /* loaded from: classes.dex */
    public static class c {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void W0(boolean z, Bundle bundle) throws RemoteException;

    void a1(boolean z, Bundle bundle) throws RemoteException;

    void j1(int i, Bundle bundle) throws RemoteException;

    /* renamed from: o.bJ0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC5297bJ0 {
        public static final int X = 2;
        public static final int Y = 3;
        public static final int Z = 4;

        /* renamed from: o.bJ0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC5297bJ0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            public String O0() {
                return InterfaceC5297bJ0.M;
            }

            @Override // o.InterfaceC5297bJ0
            public void W0(boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC5297bJ0.M);
                    obtain.writeInt(z ? 1 : 0);
                    c.d(obtain, bundle, 0);
                    this.X.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC5297bJ0
            public void a1(boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC5297bJ0.M);
                    obtain.writeInt(z ? 1 : 0);
                    c.d(obtain, bundle, 0);
                    this.X.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // o.InterfaceC5297bJ0
            public void j1(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC5297bJ0.M);
                    obtain.writeInt(i);
                    c.d(obtain, bundle, 0);
                    this.X.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, InterfaceC5297bJ0.M);
        }

        public static InterfaceC5297bJ0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC5297bJ0.M);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC5297bJ0)) {
                return (InterfaceC5297bJ0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC5297bJ0.M;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    W0(z, (Bundle) c.c(parcel, Bundle.CREATOR));
                } else {
                    j1(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                }
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a1(z, (Bundle) c.c(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.bJ0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC5297bJ0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC5297bJ0
        public void W0(boolean z, Bundle bundle) throws RemoteException {
        }

        @Override // o.InterfaceC5297bJ0
        public void a1(boolean z, Bundle bundle) throws RemoteException {
        }

        @Override // o.InterfaceC5297bJ0
        public void j1(int i, Bundle bundle) throws RemoteException {
        }
    }
}

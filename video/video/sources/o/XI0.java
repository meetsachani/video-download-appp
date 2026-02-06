package o;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface XI0 extends IInterface {
    public static final String K = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

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

    void B7(Bundle bundle) throws RemoteException;

    void F7(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    void G6(int i, int i2, Bundle bundle) throws RemoteException;

    void H3(Bundle bundle) throws RemoteException;

    void W1(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException;

    void d7(int i, Bundle bundle) throws RemoteException;

    void q6(Bundle bundle) throws RemoteException;

    void r1(String str, Bundle bundle) throws RemoteException;

    Bundle r2(String str, Bundle bundle) throws RemoteException;

    void u6(Bundle bundle) throws RemoteException;

    void z3(String str, Bundle bundle) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements XI0 {
        public static final int X = 2;
        public static final int Y = 3;
        public static final int Y0 = 5;
        public static final int Z = 4;
        public static final int Z0 = 6;
        public static final int a1 = 7;
        public static final int b1 = 8;
        public static final int c1 = 9;
        public static final int d1 = 10;
        public static final int e1 = 11;
        public static final int f1 = 12;

        /* loaded from: classes.dex */
        public static class a implements XI0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // o.XI0
            public void B7(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    c.d(obtain, bundle, 0);
                    this.X.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.XI0
            public void F7(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    obtain.writeInt(i);
                    c.d(obtain, uri, 0);
                    obtain.writeInt(z ? 1 : 0);
                    c.d(obtain, bundle, 0);
                    this.X.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o.XI0
            public void G6(int i, int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    c.d(obtain, bundle, 0);
                    this.X.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o.XI0
            public void H3(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    c.d(obtain, bundle, 0);
                    this.X.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String O0() {
                return XI0.K;
            }

            @Override // o.XI0
            public void W1(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    c.d(obtain, bundle, 0);
                    this.X.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // o.XI0
            public void d7(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    obtain.writeInt(i);
                    c.d(obtain, bundle, 0);
                    this.X.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o.XI0
            public void q6(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    c.d(obtain, bundle, 0);
                    this.X.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o.XI0
            public void r1(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    obtain.writeString(str);
                    c.d(obtain, bundle, 0);
                    this.X.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.XI0
            public Bundle r2(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    obtain.writeString(str);
                    c.d(obtain, bundle, 0);
                    this.X.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) c.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.XI0
            public void u6(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    c.d(obtain, bundle, 0);
                    this.X.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o.XI0
            public void z3(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(XI0.K);
                    obtain.writeString(str);
                    c.d(obtain, bundle, 0);
                    this.X.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, XI0.K);
        }

        public static XI0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(XI0.K);
            if (queryLocalInterface != null && (queryLocalInterface instanceof XI0)) {
                return (XI0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = XI0.K;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    d7(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    z3(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 4:
                    B7((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    r1(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    int readInt = parcel.readInt();
                    Uri uri = (Uri) c.c(parcel, Uri.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    F7(readInt, uri, z, (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 7:
                    Bundle r2 = r2(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, r2, 1);
                    break;
                case 8:
                    G6(parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 9:
                    H3((Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 10:
                    W1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 11:
                    q6((Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 12:
                    u6((Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        public IBinder asBinder() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements XI0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.XI0
        public Bundle r2(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // o.XI0
        public void B7(Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void H3(Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void q6(Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void u6(Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void d7(int i, Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void r1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void z3(String str, Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void G6(int i, int i2, Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void F7(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        }

        @Override // o.XI0
        public void W1(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
        }
    }
}

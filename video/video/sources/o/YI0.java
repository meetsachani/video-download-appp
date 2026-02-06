package o;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;
import o.XI0;

/* loaded from: classes.dex */
public interface YI0 extends IInterface {
    public static final String L = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* loaded from: classes.dex */
    public static class a implements YI0 {
        @Override // o.YI0
        public boolean E5(XI0 xi0, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public int F2(XI0 xi0, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // o.YI0
        public boolean H2(XI0 xi0, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean W3(XI0 xi0, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean X6(XI0 xi0, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.YI0
        public boolean d4(XI0 xi0, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean j6(long j) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean r6(XI0 xi0, IBinder iBinder, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public Bundle t2(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // o.YI0
        public boolean u3(XI0 xi0) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean u5(XI0 xi0, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean v5(XI0 xi0, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean x2(XI0 xi0, Uri uri) throws RemoteException {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    boolean E5(XI0 xi0, Bundle bundle) throws RemoteException;

    int F2(XI0 xi0, String str, Bundle bundle) throws RemoteException;

    boolean H2(XI0 xi0, Uri uri, Bundle bundle) throws RemoteException;

    boolean W3(XI0 xi0, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean X6(XI0 xi0, int i, Uri uri, Bundle bundle) throws RemoteException;

    boolean d4(XI0 xi0, Uri uri, int i, Bundle bundle) throws RemoteException;

    boolean j6(long j) throws RemoteException;

    boolean r6(XI0 xi0, IBinder iBinder, Bundle bundle) throws RemoteException;

    Bundle t2(String str, Bundle bundle) throws RemoteException;

    boolean u3(XI0 xi0) throws RemoteException;

    boolean u5(XI0 xi0, Bundle bundle) throws RemoteException;

    boolean v5(XI0 xi0, Bundle bundle) throws RemoteException;

    boolean x2(XI0 xi0, Uri uri) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements YI0 {
        public static final int X = 2;
        public static final int Y = 3;
        public static final int Y0 = 4;
        public static final int Z = 10;
        public static final int Z0 = 5;
        public static final int a1 = 6;
        public static final int b1 = 7;
        public static final int c1 = 11;
        public static final int d1 = 8;
        public static final int e1 = 9;
        public static final int f1 = 12;
        public static final int g1 = 13;
        public static final int h1 = 14;

        /* loaded from: classes.dex */
        public static class a implements YI0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // o.YI0
            public boolean E5(XI0 xi0, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    boolean z = false;
                    c.f(obtain, bundle, 0);
                    this.X.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public int F2(XI0 xi0, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    obtain.writeString(str);
                    c.f(obtain, bundle, 0);
                    this.X.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public boolean H2(XI0 xi0, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    boolean z = false;
                    c.f(obtain, uri, 0);
                    c.f(obtain, bundle, 0);
                    this.X.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String O0() {
                return YI0.L;
            }

            @Override // o.YI0
            public boolean W3(XI0 xi0, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    boolean z = false;
                    c.f(obtain, uri, 0);
                    c.f(obtain, bundle, 0);
                    c.e(obtain, list, 0);
                    this.X.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public boolean X6(XI0 xi0, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    obtain.writeInt(i);
                    boolean z = false;
                    c.f(obtain, uri, 0);
                    c.f(obtain, bundle, 0);
                    this.X.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // o.YI0
            public boolean d4(XI0 xi0, Uri uri, int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    boolean z = false;
                    c.f(obtain, uri, 0);
                    obtain.writeInt(i);
                    c.f(obtain, bundle, 0);
                    this.X.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public boolean j6(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeLong(j);
                    boolean z = false;
                    this.X.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public boolean r6(XI0 xi0, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    c.f(obtain, bundle, 0);
                    this.X.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public Bundle t2(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeString(str);
                    c.f(obtain, bundle, 0);
                    this.X.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) c.d(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public boolean u3(XI0 xi0) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    boolean z = false;
                    this.X.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public boolean u5(XI0 xi0, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    boolean z = false;
                    c.f(obtain, bundle, 0);
                    this.X.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public boolean v5(XI0 xi0, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    boolean z = false;
                    c.f(obtain, bundle, 0);
                    this.X.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.YI0
            public boolean x2(XI0 xi0, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(YI0.L);
                    obtain.writeStrongInterface(xi0);
                    boolean z = false;
                    c.f(obtain, uri, 0);
                    this.X.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, YI0.L);
        }

        public static YI0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(YI0.L);
            if (queryLocalInterface != null && (queryLocalInterface instanceof YI0)) {
                return (YI0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = YI0.L;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    boolean j6 = j6(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(j6 ? 1 : 0);
                    break;
                case 3:
                    boolean u3 = u3(XI0.b.O0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(u3 ? 1 : 0);
                    break;
                case 4:
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean W3 = W3(XI0.b.O0(parcel.readStrongBinder()), (Uri) c.d(parcel, Uri.CREATOR), (Bundle) c.d(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(W3 ? 1 : 0);
                    break;
                case 5:
                    Bundle t2 = t2(parcel.readString(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.f(parcel2, t2, 1);
                    break;
                case 6:
                    boolean v5 = v5(XI0.b.O0(parcel.readStrongBinder()), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(v5 ? 1 : 0);
                    break;
                case 7:
                    boolean x2 = x2(XI0.b.O0(parcel.readStrongBinder()), (Uri) c.d(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(x2 ? 1 : 0);
                    break;
                case 8:
                    int F2 = F2(XI0.b.O0(parcel.readStrongBinder()), parcel.readString(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(F2);
                    break;
                case 9:
                    boolean X6 = X6(XI0.b.O0(parcel.readStrongBinder()), parcel.readInt(), (Uri) c.d(parcel, Uri.CREATOR), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(X6 ? 1 : 0);
                    break;
                case 10:
                    boolean u5 = u5(XI0.b.O0(parcel.readStrongBinder()), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(u5 ? 1 : 0);
                    break;
                case 11:
                    boolean H2 = H2(XI0.b.O0(parcel.readStrongBinder()), (Uri) c.d(parcel, Uri.CREATOR), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(H2 ? 1 : 0);
                    break;
                case 12:
                    boolean d4 = d4(XI0.b.O0(parcel.readStrongBinder()), (Uri) c.d(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(d4 ? 1 : 0);
                    break;
                case 13:
                    boolean E5 = E5(XI0.b.O0(parcel.readStrongBinder()), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(E5 ? 1 : 0);
                    break;
                case 14:
                    boolean r6 = r6(XI0.b.O0(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) c.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(r6 ? 1 : 0);
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}

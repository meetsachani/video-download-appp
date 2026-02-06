package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: o.xL0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10687xL0 extends IInterface {
    public static final String T = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    /* renamed from: o.xL0$c */
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

    Bundle C2(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    Bundle D3(Bundle bundle) throws RemoteException;

    int H6() throws RemoteException;

    Bundle O6(Bundle bundle) throws RemoteException;

    void V6(Bundle bundle) throws RemoteException;

    Bundle c5() throws RemoteException;

    Bundle h3() throws RemoteException;

    /* renamed from: o.xL0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC10687xL0 {
        public static final int X = 6;
        public static final int Y = 2;
        public static final int Y0 = 5;
        public static final int Z = 3;
        public static final int Z0 = 4;
        public static final int a1 = 7;
        public static final int b1 = 9;

        /* renamed from: o.xL0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC10687xL0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // o.InterfaceC10687xL0
            public Bundle C2(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10687xL0.T);
                    obtain.writeString(str);
                    c.d(obtain, bundle, 0);
                    obtain.writeStrongBinder(iBinder);
                    this.X.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) c.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC10687xL0
            public Bundle D3(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10687xL0.T);
                    c.d(obtain, bundle, 0);
                    this.X.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) c.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC10687xL0
            public int H6() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10687xL0.T);
                    this.X.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String O0() {
                return InterfaceC10687xL0.T;
            }

            @Override // o.InterfaceC10687xL0
            public Bundle O6(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10687xL0.T);
                    c.d(obtain, bundle, 0);
                    this.X.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) c.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC10687xL0
            public void V6(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10687xL0.T);
                    c.d(obtain, bundle, 0);
                    this.X.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // o.InterfaceC10687xL0
            public Bundle c5() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10687xL0.T);
                    this.X.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) c.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC10687xL0
            public Bundle h3() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10687xL0.T);
                    this.X.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) c.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, InterfaceC10687xL0.T);
        }

        public static InterfaceC10687xL0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC10687xL0.T);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10687xL0)) {
                return (InterfaceC10687xL0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC10687xL0.T;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    Bundle D3 = D3((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, D3, 1);
                    break;
                case 3:
                    V6((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    int H6 = H6();
                    parcel2.writeNoException();
                    parcel2.writeInt(H6);
                    break;
                case 5:
                    Bundle c5 = c5();
                    parcel2.writeNoException();
                    c.d(parcel2, c5, 1);
                    break;
                case 6:
                    Bundle O6 = O6((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, O6, 1);
                    break;
                case 7:
                    Bundle h3 = h3();
                    parcel2.writeNoException();
                    c.d(parcel2, h3, 1);
                    break;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    Bundle C2 = C2(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    c.d(parcel2, C2, 1);
                    break;
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.xL0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC10687xL0 {
        @Override // o.InterfaceC10687xL0
        public Bundle C2(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // o.InterfaceC10687xL0
        public Bundle D3(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // o.InterfaceC10687xL0
        public int H6() throws RemoteException {
            return 0;
        }

        @Override // o.InterfaceC10687xL0
        public Bundle O6(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC10687xL0
        public Bundle c5() throws RemoteException {
            return null;
        }

        @Override // o.InterfaceC10687xL0
        public Bundle h3() throws RemoteException {
            return null;
        }

        @Override // o.InterfaceC10687xL0
        public void V6(Bundle bundle) throws RemoteException {
        }
    }
}

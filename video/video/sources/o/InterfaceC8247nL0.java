package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import o.XI0;

/* renamed from: o.nL0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8247nL0 extends IInterface {
    public static final String P = "android$support$customtabs$IPostMessageService".replace('$', '.');

    /* renamed from: o.nL0$c */
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

    void R1(XI0 xi0, String str, Bundle bundle) throws RemoteException;

    void w7(XI0 xi0, Bundle bundle) throws RemoteException;

    /* renamed from: o.nL0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC8247nL0 {
        public static final int X = 2;
        public static final int Y = 3;

        /* renamed from: o.nL0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC8247nL0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            public String O0() {
                return InterfaceC8247nL0.P;
            }

            @Override // o.InterfaceC8247nL0
            public void R1(XI0 xi0, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC8247nL0.P);
                    obtain.writeStrongInterface(xi0);
                    obtain.writeString(str);
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

            @Override // o.InterfaceC8247nL0
            public void w7(XI0 xi0, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC8247nL0.P);
                    obtain.writeStrongInterface(xi0);
                    c.d(obtain, bundle, 0);
                    this.X.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, InterfaceC8247nL0.P);
        }

        public static InterfaceC8247nL0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC8247nL0.P);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8247nL0)) {
                return (InterfaceC8247nL0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC8247nL0.P;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                R1(XI0.b.O0(parcel.readStrongBinder()), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                w7(XI0.b.O0(parcel.readStrongBinder()), (Bundle) c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.nL0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC8247nL0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC8247nL0
        public void w7(XI0 xi0, Bundle bundle) throws RemoteException {
        }

        @Override // o.InterfaceC8247nL0
        public void R1(XI0 xi0, String str, Bundle bundle) throws RemoteException {
        }
    }
}

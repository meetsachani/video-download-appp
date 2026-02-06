package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o.cJ0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5539cJ0 extends IInterface {
    Bundle G2(Bundle bundle) throws RemoteException;

    /* renamed from: o.cJ0$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC5539cJ0 {
        public static final String X = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
        public static final int Y = 1;

        /* renamed from: o.cJ0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0264a implements InterfaceC5539cJ0 {
            public IBinder X;

            public C0264a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // o.InterfaceC5539cJ0
            public Bundle G2(Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.X);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.X.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String O0() {
                return a.X;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }
        }

        public a() {
            attachInterface(this, X);
        }

        public static InterfaceC5539cJ0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC5539cJ0)) {
                return (InterfaceC5539cJ0) queryLocalInterface;
            }
            return new C0264a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(X);
                return true;
            }
            parcel.enforceInterface(X);
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            } else {
                bundle = null;
            }
            Bundle G2 = G2(bundle);
            parcel2.writeNoException();
            if (G2 != null) {
                parcel2.writeInt(1);
                G2.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}

package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: o.wL0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10444wL0 extends IInterface {
    public static final String S = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    /* renamed from: o.wL0$c */
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

    void A7(String str, Bundle bundle) throws RemoteException;

    /* renamed from: o.wL0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC10444wL0 {
        public static final int X = 2;

        /* renamed from: o.wL0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC10444wL0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // o.InterfaceC10444wL0
            public void A7(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10444wL0.S);
                    obtain.writeString(str);
                    c.d(obtain, bundle, 0);
                    this.X.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String O0() {
                return InterfaceC10444wL0.S;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }
        }

        public b() {
            attachInterface(this, InterfaceC10444wL0.S);
        }

        public static InterfaceC10444wL0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC10444wL0.S);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10444wL0)) {
                return (InterfaceC10444wL0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC10444wL0.S;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                A7(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.wL0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC10444wL0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC10444wL0
        public void A7(String str, Bundle bundle) throws RemoteException {
        }
    }
}

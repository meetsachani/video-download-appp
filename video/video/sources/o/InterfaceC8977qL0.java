package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: o.qL0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8977qL0 extends IInterface {
    public static final String Q = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    /* renamed from: o.qL0$c */
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

    void P0(int i, Bundle bundle) throws RemoteException;

    /* renamed from: o.qL0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC8977qL0 {
        public static final int X = 1;

        /* renamed from: o.qL0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC8977qL0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            public String O0() {
                return InterfaceC8977qL0.Q;
            }

            @Override // o.InterfaceC8977qL0
            public void P0(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC8977qL0.Q);
                    obtain.writeInt(i);
                    c.d(obtain, bundle, 0);
                    this.X.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }
        }

        public b() {
            attachInterface(this, InterfaceC8977qL0.Q);
        }

        public static InterfaceC8977qL0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC8977qL0.Q);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8977qL0)) {
                return (InterfaceC8977qL0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC8977qL0.Q;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                P0(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.qL0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC8977qL0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC8977qL0
        public void P0(int i, Bundle bundle) throws RemoteException {
        }
    }
}

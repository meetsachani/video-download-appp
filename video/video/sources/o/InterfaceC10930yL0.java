package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o.yL0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10930yL0 extends IInterface {
    public static final String U = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    void Z3(boolean z, boolean z2) throws RemoteException;

    /* renamed from: o.yL0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC10930yL0 {
        public static final int X = 1;

        /* renamed from: o.yL0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC10930yL0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            public String O0() {
                return InterfaceC10930yL0.U;
            }

            @Override // o.InterfaceC10930yL0
            public void Z3(boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC10930yL0.U);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
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
            attachInterface(this, InterfaceC10930yL0.U);
        }

        public static InterfaceC10930yL0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC10930yL0.U);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10930yL0)) {
                return (InterfaceC10930yL0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = InterfaceC10930yL0.U;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                Z3(z, z2);
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.yL0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC10930yL0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC10930yL0
        public void Z3(boolean z, boolean z2) throws RemoteException {
        }
    }
}

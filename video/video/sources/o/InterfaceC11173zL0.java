package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o.InterfaceC10930yL0;

/* renamed from: o.zL0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC11173zL0 extends IInterface {
    public static final String V = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    void Y6(InterfaceC10930yL0 interfaceC10930yL0) throws RemoteException;

    /* renamed from: o.zL0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC11173zL0 {
        public static final int X = 1;

        /* renamed from: o.zL0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC11173zL0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            public String O0() {
                return InterfaceC11173zL0.V;
            }

            @Override // o.InterfaceC11173zL0
            public void Y6(InterfaceC10930yL0 interfaceC10930yL0) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC11173zL0.V);
                    obtain.writeStrongInterface(interfaceC10930yL0);
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
            attachInterface(this, InterfaceC11173zL0.V);
        }

        public static InterfaceC11173zL0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC11173zL0.V);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC11173zL0)) {
                return (InterfaceC11173zL0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC11173zL0.V;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                Y6(InterfaceC10930yL0.b.O0(parcel.readStrongBinder()));
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.zL0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC11173zL0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC11173zL0
        public void Y6(InterfaceC10930yL0 interfaceC10930yL0) throws RemoteException {
        }
    }
}

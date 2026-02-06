package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0045a extends Binder implements a {
        public static final String X = "androidx.room.IMultiInstanceInvalidationCallback";
        public static final int Y = 1;

        /* renamed from: androidx.room.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0046a implements a {
            public IBinder X;

            public C0046a(IBinder iBinder) {
                this.X = iBinder;
            }

            public String O0() {
                return AbstractBinderC0045a.X;
            }

            @Override // androidx.room.a
            public void Z1(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0045a.X);
                    obtain.writeStringArray(strArr);
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

        public AbstractBinderC0045a() {
            attachInterface(this, X);
        }

        public static a O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0046a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(X);
                return true;
            }
            parcel.enforceInterface(X);
            Z1(parcel.createStringArray());
            return true;
        }
    }

    void Z1(String[] strArr) throws RemoteException;
}

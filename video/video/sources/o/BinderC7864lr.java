package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import o.AbstractC5317bO0;

@Deprecated
/* renamed from: o.lr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC7864lr extends Binder {
    public static final int Y;
    public static final int Y0 = 1;
    public static final int Z = 0;
    public static final int Z0 = 2;
    public final AbstractC5317bO0<Bundle> X;

    static {
        int i;
        if (TD2.a >= 30) {
            i = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i = 65536;
        }
        Y = i;
    }

    public BinderC7864lr(List<Bundle> list) {
        this.X = AbstractC5317bO0.F(list);
    }

    public static AbstractC5317bO0<Bundle> a(IBinder iBinder) {
        int readInt;
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            r.g((Bundle) C9542sf.g(obtain2.readBundle()));
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return r.e();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, @InterfaceC11300zs1 Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        int size = this.X.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < Y) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.X.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}

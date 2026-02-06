package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import java.util.HashMap;
import o.UU1;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int X = 0;
    public final HashMap<Integer, String> Y = new HashMap<>();
    public final RemoteCallbackList<androidx.room.a> Z = new a();
    public final b.a Y0 = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<androidx.room.a> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(androidx.room.a aVar, Object obj) {
            HashMap<Integer, String> hashMap = MultiInstanceInvalidationService.this.Y;
            Integer num = (Integer) obj;
            num.intValue();
            hashMap.remove(num);
        }
    }

    /* loaded from: classes.dex */
    public class b extends b.a {
        public b() {
        }

        @Override // androidx.room.b
        public int D5(androidx.room.a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.Z) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i = multiInstanceInvalidationService.X + 1;
                    multiInstanceInvalidationService.X = i;
                    if (multiInstanceInvalidationService.Z.register(aVar, Integer.valueOf(i))) {
                        MultiInstanceInvalidationService.this.Y.put(Integer.valueOf(i), str);
                        return i;
                    }
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                    multiInstanceInvalidationService2.X--;
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.b
        public void M7(androidx.room.a aVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.Z) {
                MultiInstanceInvalidationService.this.Z.unregister(aVar);
                MultiInstanceInvalidationService.this.Y.remove(Integer.valueOf(i));
            }
        }

        @Override // androidx.room.b
        public void n4(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.Z) {
                try {
                    String str = MultiInstanceInvalidationService.this.Y.get(Integer.valueOf(i));
                    if (str == null) {
                        Log.w(UU1.a, "Remote invalidation client ID not registered");
                        return;
                    }
                    int beginBroadcast = MultiInstanceInvalidationService.this.Z.beginBroadcast();
                    for (int i2 = 0; i2 < beginBroadcast; i2++) {
                        Integer num = (Integer) MultiInstanceInvalidationService.this.Z.getBroadcastCookie(i2);
                        int intValue = num.intValue();
                        String str2 = MultiInstanceInvalidationService.this.Y.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.Z.getBroadcastItem(i2).Z1(strArr);
                            } catch (RemoteException e) {
                                Log.w(UU1.a, "Error invoking a remote callback", e);
                            }
                        }
                    }
                    MultiInstanceInvalidationService.this.Z.finishBroadcast();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.Y0;
    }
}

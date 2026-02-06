package o;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class XT {
    public Context a;
    public JSONObject b;
    public c c;
    public ConcurrentHashMap<String, CompletableFuture<com.facebook.Y>> d;
    public C10241vW1 e;

    /* loaded from: classes2.dex */
    public class a implements Consumer<com.facebook.Y> {
        public a() {
        }

        @Override // java.util.function.Consumer
        /* renamed from: a */
        public void accept(com.facebook.Y response) {
            if (XT.this.c != null) {
                XT.this.c.a(response);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Supplier<com.facebook.Y> {
        public b() {
        }

        @Override // java.util.function.Supplier
        /* renamed from: a */
        public com.facebook.Y get() {
            String uuid = UUID.randomUUID().toString();
            try {
                XT.this.b.put(C9998uW1.C, uuid);
                Intent intent = new Intent();
                String string = XT.this.b.getString("type");
                XT.this.e.i(string, uuid, XT.this.b);
                if (!string.equals(EnumC10487wW1.GET_ACCESS_TOKEN.toString()) && !string.equals(EnumC10487wW1.IS_ENV_READY.toString())) {
                    String string2 = XT.this.a.getSharedPreferences(C9998uW1.I, 0).getString(C9998uW1.z, null);
                    if (string2 == null) {
                        return WT.d(new com.facebook.C(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request with a secure connection"), uuid);
                    }
                    intent.setPackage(string2);
                }
                intent.setAction(C9998uW1.D);
                Iterator<String> keys = XT.this.b.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    intent.putExtra(next, XT.this.b.getString(next));
                }
                CompletableFuture completableFuture = new CompletableFuture();
                XT.this.d.put(uuid, completableFuture);
                XT.this.a.sendBroadcast(intent);
                XT.this.e.l(string, uuid, XT.this.b);
                return (com.facebook.Y) completableFuture.get();
            } catch (InterruptedException | ExecutionException | JSONException unused) {
                return WT.d(new com.facebook.C(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), uuid);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(com.facebook.Y response);
    }

    public XT(Context context, JSONObject parameters, c callback) {
        this.a = context;
        this.b = parameters;
        this.c = callback;
        this.d = WT.g(context).h();
        this.e = C10241vW1.b(context);
    }

    public static com.facebook.Y i(Context context, @InterfaceC11300zs1 JSONObject parameters, EnumC10487wW1 type) {
        JSONObject put;
        try {
            if (parameters == null) {
                put = new JSONObject().put("type", type.toString());
            } else {
                put = parameters.put("type", type.toString());
            }
            return new XT(context, put, null).g();
        } catch (InterruptedException | ExecutionException | JSONException unused) {
            return WT.d(new com.facebook.C(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null);
        }
    }

    public static com.facebook.Y j(Context context, @InterfaceC11300zs1 JSONObject parameters, EnumC10487wW1 type, int timeout) {
        JSONObject put;
        try {
            if (parameters == null) {
                put = new JSONObject().put("type", type.toString());
            } else {
                put = parameters.put("type", type.toString());
            }
            return new XT(context, put, null).h(timeout);
        } catch (InterruptedException | ExecutionException | TimeoutException | JSONException unused) {
            return WT.d(new com.facebook.C(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null);
        }
    }

    public static void l(Context context, @InterfaceC11300zs1 JSONObject parameters, c callback, String type) {
        JSONObject put;
        try {
            if (parameters == null) {
                put = new JSONObject().put("type", type);
            } else {
                put = parameters.put("type", type);
            }
            new XT(context, put, callback).k();
        } catch (InterruptedException | ExecutionException | JSONException unused) {
            if (callback != null) {
                callback.a(WT.d(new com.facebook.C(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null));
            }
        }
    }

    public static void m(Context context, @InterfaceC11300zs1 JSONObject parameters, c callback, EnumC10487wW1 type) {
        JSONObject put;
        try {
            if (parameters == null) {
                put = new JSONObject().put("type", type.toString());
            } else {
                put = parameters.put("type", type.toString());
            }
            new XT(context, put, callback).k();
        } catch (InterruptedException | ExecutionException | JSONException unused) {
            if (callback != null) {
                callback.a(WT.d(new com.facebook.C(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null));
            }
        }
    }

    public final CompletableFuture<com.facebook.Y> f() {
        return CompletableFuture.supplyAsync(new b());
    }

    public final com.facebook.Y g() throws ExecutionException, InterruptedException {
        return f().get();
    }

    public final com.facebook.Y h(int timeout) throws ExecutionException, InterruptedException, TimeoutException {
        return f().get(timeout, TimeUnit.SECONDS);
    }

    public final void k() throws ExecutionException, InterruptedException {
        f().thenAccept((Consumer<? super com.facebook.Y>) new a());
    }
}

package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import java.net.HttpURLConnection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WT {
    @InterfaceC11300zs1
    public static WT a;
    public static ConcurrentHashMap<String, CompletableFuture<com.facebook.Y>> b;
    public static C10241vW1 c;

    /* loaded from: classes2.dex */
    public static class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CompletableFuture completableFuture;
            try {
                JSONObject jSONObject = new JSONObject(intent.getStringExtra(C9998uW1.F));
                String string = jSONObject.getString(C9998uW1.C);
                if (WT.b.containsKey(string) && (completableFuture = (CompletableFuture) WT.b.remove(string)) != null) {
                    completableFuture.complete(WT.i(jSONObject, string));
                }
            } catch (JSONException unused) {
            }
        }
    }

    public WT(Context context) {
        IntentFilter intentFilter = new IntentFilter(C9998uW1.G);
        HandlerThread handlerThread = new HandlerThread(C9998uW1.H);
        handlerThread.start();
        context.registerReceiver(new b(), intentFilter, null, new Handler(handlerThread.getLooper()));
        b = new ConcurrentHashMap<>();
        c = C10241vW1.b(context);
    }

    public static com.facebook.Y c(String requestID) {
        return d(new com.facebook.C(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), requestID);
    }

    public static com.facebook.Y d(com.facebook.C error, @InterfaceC11300zs1 String requestID) {
        c.j(error, requestID);
        return new com.facebook.Y(new com.facebook.S(), null, error);
    }

    public static com.facebook.Y e(JSONObject response, String requestID) {
        JSONObject optJSONObject = response.optJSONObject("error");
        if (optJSONObject != null) {
            return d(new com.facebook.C(optJSONObject.optInt("code"), optJSONObject.optString("type"), optJSONObject.optString("message")), requestID);
        }
        return c(requestID);
    }

    public static com.facebook.Y f(JSONObject response, String requestID) {
        if (response.optJSONObject("success") != null) {
            c.k(requestID);
            return new com.facebook.Y(new com.facebook.S(), (HttpURLConnection) null, "", response.optJSONObject("success"));
        } else if (response.optJSONArray("success") != null) {
            c.k(requestID);
            return new com.facebook.Y(new com.facebook.S(), (HttpURLConnection) null, "", response.optJSONArray("success"));
        } else {
            return c(requestID);
        }
    }

    public static synchronized WT g(Context context) {
        WT wt;
        synchronized (WT.class) {
            try {
                if (a == null) {
                    a = new WT(context);
                }
                wt = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wt;
    }

    public static com.facebook.Y i(JSONObject payload, String requestID) {
        if (!payload.isNull("success")) {
            return f(payload, requestID);
        }
        if (!payload.isNull("error")) {
            return e(payload, requestID);
        }
        return c(requestID);
    }

    public synchronized ConcurrentHashMap<String, CompletableFuture<com.facebook.Y>> h() {
        return b;
    }
}

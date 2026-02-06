package o;

import android.content.Context;
import o.XT;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.vC0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10162vC0 {
    public static void a(Context context, JSONObject parameters, XT.c callback) {
        XT.m(context, parameters, callback, EnumC10487wW1.CAN_CREATE_SHORTCUT);
    }

    public static void b(Context context, JSONObject parameters, XT.c callback) {
        XT.m(context, parameters, callback, EnumC10487wW1.CREATE_SHORTCUT);
    }

    public static void c(Context context, int score, @InterfaceC11300zs1 String title, @InterfaceC11300zs1 String image, @InterfaceC11300zs1 String sortOrder, @InterfaceC11300zs1 String scoreFormat, @InterfaceC11300zs1 Integer endTime, @InterfaceC11300zs1 JSONObject payload, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.M, score).put("title", title).put("image", image).put(C9998uW1.N, sortOrder).put(C9998uW1.O, scoreFormat).put(C9998uW1.Q, endTime).put("data", payload), callback, EnumC10487wW1.TOURNAMENT_CREATE_ASYNC);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.TOURNAMENT_CREATE_ASYNC, e);
        }
    }

    public static void d(Context context, JSONObject parameters, XT.c callback) {
        XT.m(context, parameters, callback, EnumC10487wW1.GET_PAYLOAD);
    }

    public static void e(Context context, XT.c callback) {
        XT.m(context, null, callback, EnumC10487wW1.GET_TOURNAMENT_ASYNC);
    }

    public static void f(Context context, XT.c callback) throws JSONException {
        XT.m(context, null, callback, EnumC10487wW1.TOURNAMENT_GET_TOURNAMENTS_ASYNC);
    }

    public static void g(Context context, String tournamentId, XT.c callback) throws JSONException {
        XT.m(context, new JSONObject().put(C9998uW1.C0, tournamentId), callback, EnumC10487wW1.TOURNAMENT_JOIN_ASYNC);
    }

    public static void h(Context context) {
        XT.m(context, null, new a(), EnumC10487wW1.PERFORM_HAPTIC_FEEDBACK_ASYNC);
    }

    public static void i(Context context, int score, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put("score", score), callback, EnumC10487wW1.POST_SESSION_SCORE);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.POST_SESSION_SCORE, e);
        }
    }

    public static void j(Context context, int score, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put("score", score), callback, EnumC10487wW1.POST_SESSION_SCORE_ASYNC);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.POST_SESSION_SCORE_ASYNC, e);
        }
    }

    public static void k(Context context, int score, XT.c callback) throws JSONException {
        XT.m(context, new JSONObject().put("score", score), callback, EnumC10487wW1.TOURNAMENT_POST_SCORE_ASYNC);
    }

    public static void l(Context context, @InterfaceC11300zs1 Integer score, @InterfaceC11300zs1 JSONObject payload, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put("score", score).put("data", payload), callback, EnumC10487wW1.TOURNAMENT_SHARE_ASYNC);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.TOURNAMENT_SHARE_ASYNC, e);
        }
    }

    /* renamed from: o.vC0$a */
    /* loaded from: classes2.dex */
    public class a implements XT.c {
        @Override // o.XT.c
        public void a(com.facebook.Y response) {
        }
    }
}

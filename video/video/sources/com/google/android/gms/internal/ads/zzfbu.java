package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.facebook.appevents.C2326p;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C10928yK2;
import o.C11304zt1;
import o.C3599Ly1;
import o.C5588cW;
import o.C8206nB;
import o.C9642t32;
import o.C9755tW1;
import o.InterfaceC11300zs1;
import o.VN2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfbu {
    @InterfaceC11300zs1
    public final zzbxs A;
    public final List A0;
    public final String B;
    public final boolean B0;
    public final JSONObject C;
    public final JSONObject D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final zzfcs V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public final String Z;
    public final List a;
    public final int a0;
    public final int b;
    public final String b0;
    public final List c;
    public final boolean c0;
    public final List d;
    @InterfaceC11300zs1
    public final zzbtr d0;
    public final int e;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzt e0;
    public final List f;
    public final String f0;
    public final List g;
    public final boolean g0;
    public final List h;
    public final JSONObject h0;
    public final List i;
    public final boolean i0;
    public final String j;
    public final JSONObject j0;
    public final String k;
    public final boolean k0;
    @InterfaceC11300zs1
    public final zzbwj l;
    @InterfaceC11300zs1
    public final String l0;
    public final List m;
    public final boolean m0;
    public final List n;
    public final String n0;

    /* renamed from: o */
    public final List f277o;
    public final String o0;
    public final List p;
    public final String p0;
    public final int q;
    public final boolean q0;
    public final List r;
    public final boolean r0;
    @InterfaceC11300zs1
    public final zzfbz s;
    public final int s0;
    public final List t;
    public final String t0;
    public final List u;
    public final List u0;
    public final JSONObject v;
    public final boolean v0;
    public final String w;
    public final Map w0;
    public final String x;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.util.client.zzv x0;
    public final String y;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.util.client.zzw y0;
    public final String z;
    public final double z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v277, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v284, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v297, types: [java.util.List] */
    public zzfbu(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List list;
        List list2;
        char c;
        List list3 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfyc.F();
        zzfyc F = zzfyc.F();
        HashMap hashMap = new HashMap();
        zzfyc F2 = zzfyc.F();
        jsonReader.beginObject();
        List list4 = list3;
        List list5 = list4;
        List list6 = list5;
        List list7 = list6;
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObject2;
        JSONObject jSONObject9 = jSONObject3;
        JSONObject jSONObject10 = jSONObject4;
        JSONObject jSONObject11 = jSONObject5;
        JSONObject jSONObject12 = jSONObject6;
        zzfyc zzfycVar = F;
        HashMap hashMap2 = hashMap;
        zzfyc zzfycVar2 = F2;
        double d = 0.0d;
        zzbxs zzbxsVar = null;
        zzbtr zzbtrVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        String str = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar = null;
        zzfbz zzfbzVar = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        String str20 = str19;
        String str21 = str20;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i5 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i6 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        int i7 = 0;
        boolean z19 = false;
        boolean z20 = false;
        List list8 = list7;
        List list9 = list8;
        List list10 = list9;
        List list11 = list10;
        List list12 = list11;
        List list13 = list12;
        List list14 = list13;
        List list15 = list14;
        List list16 = list15;
        zzbwj zzbwjVar = null;
        int i8 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? str3 : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_source_instance_name")) {
                        c = C10928yK2.l;
                        break;
                    }
                    c = 65535;
                    break;
                case -1980587809:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("debug_signals")) {
                        c = C5588cW.n;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1964744830:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("offline_ad_config")) {
                        c = 'O';
                        break;
                    }
                    c = 65535;
                    break;
                case -1871425831:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("recursive_server_response_data")) {
                        c = C3599Ly1.i;
                        break;
                    }
                    c = 65535;
                    break;
                case -1843156475:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_consent")) {
                        c = 'G';
                        break;
                    }
                    c = 65535;
                    break;
                case -1840512279:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("presentation_urls")) {
                        c = 'P';
                        break;
                    }
                    c = 65535;
                    break;
                case -1828733410:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("network_ping_config")) {
                        c = 'N';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case -1785028569:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("parallel_key")) {
                        c = 'I';
                        break;
                    }
                    c = 65535;
                    break;
                case -1776946669:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_source_name")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case -1662989631:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("backend_query_id")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -1550155393:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("nofill_urls")) {
                        c = C8206nB.d;
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1406227629:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -1375413093:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("test_mode_enabled")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("extras")) {
                        c = C5588cW.f706o;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        c = C5588cW.p;
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = list15;
                    list2 = list16;
                    if (str22.equals(C2326p.e0)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("fill_urls")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("video_complete_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("valid_from_timestamp")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -972056451:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_source_instance_id")) {
                        c = '<';
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -570101180:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("late_load_urls")) {
                        c = 'J';
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404433734:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("rtb_native_required_assets")) {
                        c = '>';
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("render_timeout_ms")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -388807511:
                    list = list15;
                    list2 = list16;
                    if (str22.equals(C9642t32.S0)) {
                        c = C11304zt1.a;
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case -213449460:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -180214626:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("native_required_asset_viewability")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case -154616268:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_offline_ad")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("id")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("data")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 37109963:
                    list = list15;
                    list2 = list16;
                    if (str22.equals(C9755tW1.f875o)) {
                        c = 'D';
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_closable_area_disabled")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case 542250332:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("consent_form_action_identifier")) {
                        c = 'H';
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 805095541:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("analytics_event_name_to_parameters_map")) {
                        c = 'M';
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = list15;
                    list2 = list16;
                    if (str22.equals(FirebaseAnalytics.Param.F)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("rewards")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1141602460:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("adapter_response_info_key")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 1186014765:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("cache_hit_urls")) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case 1303622534:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("preload_sort_value")) {
                        c = 'L';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        c = VN2.b;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422388341:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_collapsible")) {
                        c = 'F';
                        break;
                    }
                    c = 65535;
                    break;
                case 1437255331:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_source_id")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1686319423:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("video_reward_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("use_third_party_container_height")) {
                        c = C3599Ly1.j;
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2075506442:
                    list = list15;
                    list2 = list16;
                    if (str22.equals("render_serially")) {
                        c = 'K';
                        break;
                    }
                    c = 65535;
                    break;
                case 2117205836:
                    list2 = list16;
                    list = list15;
                    if (str22.equals("flow_control")) {
                        c = 'Q';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = list15;
                    list2 = list16;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    list3 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 1:
                    i8 = c(jsonReader.nextString());
                    break;
                case 2:
                    list8 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 3:
                    list9 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 4:
                    list10 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 5:
                    i3 = e(jsonReader.nextInt());
                    break;
                case 6:
                    list11 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 7:
                    list12 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case '\b':
                    list13 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case '\t':
                    str3 = jsonReader.nextString();
                    break;
                case '\n':
                    str2 = jsonReader.nextString();
                    break;
                case 11:
                    zzbwjVar = zzbwj.m0(com.google.android.gms.ads.internal.util.zzbs.f(jsonReader));
                    break;
                case '\f':
                    list14 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case '\r':
                    list15 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    continue;
                    list16 = list2;
                case 14:
                    list2 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 15:
                    list7 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 16:
                    i4 = jsonReader.nextInt();
                    break;
                case 17:
                    list6 = zzfbv.a(jsonReader);
                    break;
                case 18:
                    zzfbzVar = new zzfbz(jsonReader);
                    break;
                case 19:
                    list4 = zzfbv.a(jsonReader);
                    break;
                case 20:
                    list5 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 21:
                    str4 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                    break;
                case 23:
                    str5 = jsonReader.nextString();
                    break;
                case 24:
                    str6 = jsonReader.nextString();
                    break;
                case 25:
                    str7 = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader).toString();
                    break;
                case 26:
                    zzbxsVar = zzbxs.m0(com.google.android.gms.ads.internal.util.zzbs.i(jsonReader));
                    break;
                case 27:
                    str8 = jsonReader.nextString();
                    break;
                case 28:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                    break;
                case 29:
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '%':
                    i = d(jsonReader.nextString());
                    break;
                case '&':
                    i5 = jsonReader.nextInt();
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '(':
                    str9 = jsonReader.nextString();
                    break;
                case ')':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i6 = jsonReader.nextInt();
                    break;
                case '-':
                    i2 = jsonReader.nextInt();
                    break;
                case '.':
                    str10 = jsonReader.nextString();
                    break;
                case '/':
                    str11 = jsonReader.nextString();
                    break;
                case '0':
                    z11 = jsonReader.nextBoolean();
                    break;
                case '1':
                    zzbtrVar = zzbtr.a(com.google.android.gms.ads.internal.util.zzbs.i(jsonReader));
                    break;
                case '2':
                    jsonReader.nextBoolean();
                    break;
                case '3':
                    zztVar = com.google.android.gms.ads.internal.client.zzt.m0(com.google.android.gms.ads.internal.util.zzbs.i(jsonReader));
                    break;
                case '4':
                    str12 = jsonReader.nextString();
                    break;
                case '5':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '6':
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                    break;
                case '7':
                    str13 = jsonReader.nextString();
                    break;
                case '8':
                    str20 = jsonReader.nextString();
                    break;
                case '9':
                    str14 = jsonReader.nextString();
                    break;
                case ':':
                    str15 = jsonReader.nextString();
                    break;
                case ';':
                    str16 = jsonReader.nextString();
                    break;
                case '<':
                    str17 = jsonReader.nextString();
                    break;
                case '=':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '>':
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                    break;
                case '?':
                    z14 = jsonReader.nextBoolean();
                    break;
                case '@':
                    str = jsonReader.nextString();
                    break;
                case 'A':
                    z15 = jsonReader.nextBoolean();
                    break;
                case 'B':
                    com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 'C':
                    z16 = jsonReader.nextBoolean();
                    break;
                case 'D':
                    str18 = jsonReader.nextString();
                    break;
                case 'E':
                    str19 = jsonReader.nextString();
                    break;
                case 'F':
                    z17 = jsonReader.nextBoolean();
                    break;
                case 'G':
                    z18 = jsonReader.nextBoolean();
                    break;
                case 'H':
                    i7 = jsonReader.nextInt();
                    break;
                case 'I':
                    str21 = jsonReader.nextString();
                    break;
                case 'J':
                    zzfycVar = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 'K':
                    z19 = jsonReader.nextBoolean();
                    break;
                case 'L':
                    d = jsonReader.nextDouble();
                    list15 = list;
                    continue;
                    list16 = list2;
                case 'M':
                    if (((Boolean) zzbcv.q0.j()).booleanValue()) {
                        hashMap2 = com.google.android.gms.ads.internal.util.zzbs.e(jsonReader);
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 'N':
                    if (((Boolean) zzbcv.Q8.j()).booleanValue()) {
                        zzvVar = com.google.android.gms.ads.internal.util.client.zzv.a(com.google.android.gms.ads.internal.util.zzbs.i(jsonReader));
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 'O':
                    if (((Boolean) zzbcv.S8.j()).booleanValue()) {
                        zzwVar = com.google.android.gms.ads.internal.util.client.zzw.d(com.google.android.gms.ads.internal.util.zzbs.i(jsonReader));
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 'P':
                    zzfycVar2 = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
                    break;
                case 'Q':
                    z20 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            list15 = list;
            list16 = list2;
        }
        jsonReader.endObject();
        this.a = list3;
        this.b = i8;
        this.c = list8;
        this.d = list9;
        this.f = list10;
        this.e = i3;
        this.g = list11;
        this.h = list12;
        this.i = list13;
        this.j = str3;
        this.k = str2;
        this.l = zzbwjVar;
        this.m = list14;
        this.n = list15;
        this.f277o = list16;
        this.p = list7;
        this.q = i4;
        this.r = list6;
        this.s = zzfbzVar;
        this.t = list5;
        this.u = list4;
        this.w = str4;
        this.v = jSONObject7;
        this.x = str5;
        this.y = str6;
        this.z = str7;
        this.A = zzbxsVar;
        this.B = str8;
        this.C = jSONObject8;
        this.D = jSONObject9;
        this.J = z;
        this.K = z2;
        this.L = z3;
        this.M = z4;
        this.N = z5;
        this.O = z6;
        this.P = z7;
        this.Q = i;
        this.R = i5;
        this.T = z8;
        this.U = str9;
        this.V = new zzfcs(jSONObject10);
        this.W = z9;
        this.X = z10;
        this.Y = i6;
        this.Z = str10;
        this.a0 = i2;
        this.b0 = str11;
        this.c0 = z11;
        this.d0 = zzbtrVar;
        this.e0 = zztVar;
        this.f0 = str12;
        this.g0 = z12;
        this.h0 = jSONObject11;
        this.E = str13;
        this.F = str14;
        this.G = str15;
        this.H = str16;
        this.I = str17;
        this.i0 = z13;
        this.j0 = jSONObject12;
        this.k0 = z14;
        this.l0 = str;
        this.m0 = z15;
        this.S = z16;
        this.n0 = str18;
        this.o0 = str19;
        this.p0 = str20;
        this.q0 = z17;
        this.r0 = z18;
        this.s0 = i7;
        this.u0 = zzfycVar;
        this.t0 = str21;
        this.v0 = z19;
        this.w0 = hashMap2;
        this.x0 = zzvVar;
        this.y0 = zzwVar;
        this.z0 = d;
        this.A0 = zzfycVar2;
        this.B0 = z20;
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    public static int c(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        if ("rewarded_interstitial".equals(str)) {
            return 7;
        }
        return 0;
    }

    public static int d(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            return 7;
        }
        return -1;
    }

    public static int e(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 4) {
            return i;
        }
        return 0;
    }

    public final boolean b() {
        return this.i0 || this.y0 != null;
    }
}

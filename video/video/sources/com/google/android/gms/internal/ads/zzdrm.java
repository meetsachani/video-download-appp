package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdrm {
    public static final zzfyc d;
    public static final zzfyc e;
    public final String a;
    public final zzdrl b;
    public final zzdrl c;

    static {
        zzdrl zzdrlVar = zzdrl.PUBLIC_API_CALL;
        zzdrl zzdrlVar2 = zzdrl.PUBLIC_API_CALLBACK;
        zzdrm zzdrmVar = new zzdrm("tqgt", zzdrlVar, zzdrlVar2);
        zzdrl zzdrlVar3 = zzdrl.DYNAMITE_ENTER;
        zzdrm zzdrmVar2 = new zzdrm("l.dl", zzdrlVar, zzdrlVar3);
        zzdrl zzdrlVar4 = zzdrl.READ_FROM_DISK_START;
        zzdrm zzdrmVar3 = new zzdrm("l.rccde", zzdrlVar3, zzdrlVar4);
        zzdrm zzdrmVar4 = new zzdrm("l.rfd", zzdrlVar4, zzdrl.READ_FROM_DISK_END);
        zzdrl zzdrlVar5 = zzdrl.CLIENT_SIGNALS_START;
        zzdrm zzdrmVar5 = new zzdrm("l.rcc", zzdrlVar3, zzdrlVar5);
        zzdrl zzdrlVar6 = zzdrl.CLIENT_SIGNALS_END;
        zzdrm zzdrmVar6 = new zzdrm("l.cs", zzdrlVar5, zzdrlVar6);
        zzdrl zzdrlVar7 = zzdrl.SERVICE_CONNECTED;
        zzdrm zzdrmVar7 = new zzdrm("l.cts", zzdrlVar6, zzdrlVar7);
        zzdrl zzdrlVar8 = zzdrl.GMS_SIGNALS_START;
        zzdrl zzdrlVar9 = zzdrl.GMS_SIGNALS_END;
        zzdrm zzdrmVar8 = new zzdrm("l.gs", zzdrlVar8, zzdrlVar9);
        zzdrl zzdrlVar10 = zzdrl.GET_SIGNALS_SDKCORE_START;
        zzdrm zzdrmVar9 = new zzdrm("l.jse", zzdrlVar9, zzdrlVar10);
        zzdrl zzdrlVar11 = zzdrl.GET_SIGNALS_SDKCORE_END;
        zzdrm zzdrmVar10 = new zzdrm("l.gs-sdkcore", zzdrlVar10, zzdrlVar11);
        zzdrm zzdrmVar11 = new zzdrm("l.gs-pp", zzdrlVar11, zzdrlVar2);
        zzdrl zzdrlVar12 = zzdrl.RENDERING_START;
        zzdrm zzdrmVar12 = new zzdrm("l.render", zzdrlVar12, zzdrlVar2);
        zzdrl zzdrlVar13 = zzdrl.RENDERING_WEBVIEW_CREATION_START;
        zzdrm zzdrmVar13 = new zzdrm("l.render.pre", zzdrlVar12, zzdrlVar13);
        zzdrl zzdrlVar14 = zzdrl.RENDERING_WEBVIEW_CREATION_END;
        zzdrm zzdrmVar14 = new zzdrm("l.render.wvc", zzdrlVar13, zzdrlVar14);
        zzdrl zzdrlVar15 = zzdrl.RENDERING_AD_COMPONENT_CREATION_END;
        zzdrm zzdrmVar15 = new zzdrm("l.render.acc", zzdrlVar14, zzdrlVar15);
        zzdrl zzdrlVar16 = zzdrl.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdrl zzdrlVar17 = zzdrl.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdrm zzdrmVar16 = new zzdrm("l.render.cfg-wv", zzdrlVar16, zzdrlVar17);
        zzdrl zzdrlVar18 = zzdrl.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdrl zzdrlVar19 = zzdrl.RENDERING_WEBVIEW_LOAD_HTML_END;
        d = zzfyc.M(zzdrmVar, zzdrmVar2, zzdrmVar3, zzdrmVar4, zzdrmVar5, zzdrmVar6, zzdrmVar7, zzdrmVar8, zzdrmVar9, zzdrmVar10, zzdrmVar11, zzdrmVar12, zzdrmVar13, zzdrmVar14, zzdrmVar15, zzdrmVar16, new zzdrm("l.render.wvlh", zzdrlVar18, zzdrlVar19), new zzdrm("l.render.post", zzdrlVar19, zzdrlVar2), new zzdrm("l.sodv", zzdrl.SIGNAL_ON_DISK_VALIDATION_START, zzdrl.SIGNAL_ON_DISK_VALIDATION_END), new zzdrm("l.sodck", zzdrl.SIGNAL_ON_DISK_CACHE_KEY_START, zzdrl.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdrm("l.sodrar", zzdrl.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdrl.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdrm("l.soddc", zzdrl.SIGNAL_ON_DISK_DECODE_START, zzdrl.SIGNAL_ON_DISK_DECODE_END));
        zzdrm zzdrmVar17 = new zzdrm("l.al", zzdrlVar, zzdrlVar2);
        zzdrm zzdrmVar18 = new zzdrm("l.al2", zzdrlVar3, zzdrlVar2);
        zzdrm zzdrmVar19 = new zzdrm("l.dl", zzdrlVar, zzdrlVar3);
        zzdrm zzdrmVar20 = new zzdrm("l.rcc", zzdrlVar3, zzdrlVar5);
        zzdrm zzdrmVar21 = new zzdrm("l.cs", zzdrlVar5, zzdrlVar6);
        zzdrm zzdrmVar22 = new zzdrm("l.cts", zzdrlVar6, zzdrlVar7);
        zzdrm zzdrmVar23 = new zzdrm("l.gs", zzdrlVar8, zzdrlVar9);
        zzdrl zzdrlVar20 = zzdrl.GET_AD_DICTIONARY_SDKCORE_START;
        zzdrm zzdrmVar24 = new zzdrm("l.jse", zzdrlVar9, zzdrlVar20);
        zzdrl zzdrlVar21 = zzdrl.GET_AD_DICTIONARY_SDKCORE_END;
        zzdrm zzdrmVar25 = new zzdrm("l.gad-js", zzdrlVar20, zzdrlVar21);
        zzdrl zzdrlVar22 = zzdrl.HTTP_RESPONSE_READY;
        zzdrm zzdrmVar26 = new zzdrm("l.http", zzdrlVar21, zzdrlVar22);
        zzdrl zzdrlVar23 = zzdrl.SCAR_PRELOADER_READY;
        zzdrm zzdrmVar27 = new zzdrm("l.slas.pre", zzdrlVar, zzdrlVar23);
        zzdrl zzdrlVar24 = zzdrl.SCAR_PRELOADER_PROCESSING_DONE;
        zzdrm zzdrmVar28 = new zzdrm("l.slas.prel.p", zzdrlVar23, zzdrlVar24);
        zzdrl zzdrlVar25 = zzdrl.NORMALIZATION_AD_RESPONSE_START;
        zzdrm zzdrmVar29 = new zzdrm("l.jse-nml", zzdrlVar22, zzdrlVar25);
        zzdrm zzdrmVar30 = new zzdrm("l.jse-nml", zzdrlVar24, zzdrlVar25);
        zzdrl zzdrlVar26 = zzdrl.NORMALIZATION_AD_RESPONSE_END;
        zzdrm zzdrmVar31 = new zzdrm("l.nml-js", zzdrlVar25, zzdrlVar26);
        zzdrl zzdrlVar27 = zzdrl.BINDER_CALL_START;
        zzdrm zzdrmVar32 = new zzdrm("l.nml-gmsg", zzdrlVar26, zzdrlVar27);
        zzdrl zzdrlVar28 = zzdrl.SERVER_RESPONSE_PARSE_START;
        zzdrm zzdrmVar33 = new zzdrm("l.nml-gmsg.s2s", zzdrlVar26, zzdrlVar28);
        zzdrm zzdrmVar34 = new zzdrm("l.binder", zzdrlVar27, zzdrlVar28);
        zzdrm zzdrmVar35 = new zzdrm("l.sr", zzdrlVar28, zzdrlVar12);
        zzdrm zzdrmVar36 = new zzdrm("l.render", zzdrlVar12, zzdrlVar2);
        zzdrm zzdrmVar37 = new zzdrm("l.t2", zzdrl.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdrl.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdrl zzdrlVar29 = zzdrl.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdrl zzdrlVar30 = zzdrl.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdrm zzdrmVar38 = new zzdrm("l.render.na.js", zzdrlVar29, zzdrlVar30);
        zzdrm zzdrmVar39 = new zzdrm("l.render.na.prep", zzdrlVar30, zzdrl.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdrm zzdrmVar40 = new zzdrm("l.render.na.lna", zzdrl.RENDERING_NATIVE_ASSETS_LOADING_START, zzdrl.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdrm zzdrmVar41 = new zzdrm("l.render.wvc", zzdrlVar13, zzdrlVar14);
        zzdrm zzdrmVar42 = new zzdrm("l.render.acc", zzdrlVar14, zzdrlVar15);
        zzdrm zzdrmVar43 = new zzdrm("l.render.cfg-wv", zzdrlVar16, zzdrlVar17);
        zzdrm zzdrmVar44 = new zzdrm("l.render.pre", zzdrlVar12, zzdrlVar13);
        zzdrm zzdrmVar45 = new zzdrm("l.render.post", zzdrlVar19, zzdrlVar2);
        zzdrm zzdrmVar46 = new zzdrm("l.render.na.post", zzdrlVar17, zzdrlVar2);
        zzdrm zzdrmVar47 = new zzdrm("l.render.wvlh", zzdrlVar18, zzdrlVar19);
        zzdrm zzdrmVar48 = new zzdrm("l.na.b", zzdrl.NATIVE_ASSETS_LOADING_BASIC_START, zzdrl.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdrm zzdrmVar49 = new zzdrm("l.na.im", zzdrl.NATIVE_ASSETS_LOADING_IMAGE_START, zzdrl.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdrm zzdrmVar50 = new zzdrm("l.na.imc", zzdrl.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdrl.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdrm zzdrmVar51 = new zzdrm("l.na.l", zzdrl.NATIVE_ASSETS_LOADING_LOGO_START, zzdrl.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdrm zzdrmVar52 = new zzdrm("l.na.ic", zzdrl.NATIVE_ASSETS_LOADING_ICON_START, zzdrl.NATIVE_ASSETS_LOADING_ICON_END);
        zzdrm zzdrmVar53 = new zzdrm("l.na.a", zzdrl.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdrl.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzdrl zzdrlVar31 = zzdrl.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdrl zzdrlVar32 = zzdrl.NATIVE_ASSETS_LOADING_VIDEO_END;
        e = zzfyc.M(zzdrmVar17, zzdrmVar18, zzdrmVar19, zzdrmVar20, zzdrmVar21, zzdrmVar22, zzdrmVar23, zzdrmVar24, zzdrmVar25, zzdrmVar26, zzdrmVar27, zzdrmVar28, zzdrmVar29, zzdrmVar30, zzdrmVar31, zzdrmVar32, zzdrmVar33, zzdrmVar34, zzdrmVar35, zzdrmVar36, zzdrmVar37, zzdrmVar38, zzdrmVar39, zzdrmVar40, zzdrmVar41, zzdrmVar42, zzdrmVar43, zzdrmVar44, zzdrmVar45, zzdrmVar46, zzdrmVar47, zzdrmVar48, zzdrmVar49, zzdrmVar50, zzdrmVar51, zzdrmVar52, zzdrmVar53, new zzdrm("l.na.v", zzdrlVar31, zzdrlVar32), new zzdrm("l.na.vc", zzdrl.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdrlVar32), new zzdrm("l.na.m", zzdrl.NATIVE_ASSETS_LOADING_MEDIA_START, zzdrl.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdrm("l.na.c", zzdrl.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdrl.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdrm("l.na.o", zzdrl.NATIVE_ASSETS_LOADING_OMID_START, zzdrl.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdrm(String str, zzdrl zzdrlVar, zzdrl zzdrlVar2) {
        this.a = str;
        this.b = zzdrlVar;
        this.c = zzdrlVar2;
    }

    public final zzdrl a() {
        return this.b;
    }

    public final zzdrl b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }
}

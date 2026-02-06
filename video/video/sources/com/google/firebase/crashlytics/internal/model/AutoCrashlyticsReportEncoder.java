package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import java.io.IOException;
import o.BU0;
import o.C3209Hz;
import o.C3771Nr1;
import o.InterfaceC8148mw2;
import o.SQ0;

/* loaded from: classes3.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int a = 2;
    public static final Configurator b = new AutoCrashlyticsReportEncoder();

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {
        public static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder a = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("arch");
        public static final FieldDescriptor c = FieldDescriptor.d("libraryName");
        public static final FieldDescriptor d = FieldDescriptor.d("buildId");

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, buildIdMappingForArch.b());
            objectEncoderContext.k(c, buildIdMappingForArch.d());
            objectEncoderContext.k(d, buildIdMappingForArch.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {
        public static final CrashlyticsReportApplicationExitInfoEncoder a = new CrashlyticsReportApplicationExitInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("pid");
        public static final FieldDescriptor c = FieldDescriptor.d("processName");
        public static final FieldDescriptor d = FieldDescriptor.d("reasonCode");
        public static final FieldDescriptor e = FieldDescriptor.d("importance");
        public static final FieldDescriptor f = FieldDescriptor.d("pss");
        public static final FieldDescriptor g = FieldDescriptor.d("rss");
        public static final FieldDescriptor h = FieldDescriptor.d("timestamp");
        public static final FieldDescriptor i = FieldDescriptor.d("traceFile");
        public static final FieldDescriptor j = FieldDescriptor.d("buildIdMappingForArch");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.c(b, applicationExitInfo.d());
            objectEncoderContext.k(c, applicationExitInfo.e());
            objectEncoderContext.c(d, applicationExitInfo.g());
            objectEncoderContext.c(e, applicationExitInfo.c());
            objectEncoderContext.b(f, applicationExitInfo.f());
            objectEncoderContext.b(g, applicationExitInfo.h());
            objectEncoderContext.b(h, applicationExitInfo.i());
            objectEncoderContext.k(i, applicationExitInfo.j());
            objectEncoderContext.k(j, applicationExitInfo.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {
        public static final CrashlyticsReportCustomAttributeEncoder a = new CrashlyticsReportCustomAttributeEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("key");
        public static final FieldDescriptor c = FieldDescriptor.d("value");

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, customAttribute.b());
            objectEncoderContext.k(c, customAttribute.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {
        public static final CrashlyticsReportEncoder a = new CrashlyticsReportEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d(RemoteConfigConstants.RequestFieldKey.e0);
        public static final FieldDescriptor c = FieldDescriptor.d("gmpAppId");
        public static final FieldDescriptor d = FieldDescriptor.d("platform");
        public static final FieldDescriptor e = FieldDescriptor.d("installationUuid");
        public static final FieldDescriptor f = FieldDescriptor.d("firebaseInstallationId");
        public static final FieldDescriptor g = FieldDescriptor.d("appQualitySessionId");
        public static final FieldDescriptor h = FieldDescriptor.d("buildVersion");
        public static final FieldDescriptor i = FieldDescriptor.d("displayVersion");
        public static final FieldDescriptor j = FieldDescriptor.d(SettingsJsonConstants.b);
        public static final FieldDescriptor k = FieldDescriptor.d("ndkPayload");
        public static final FieldDescriptor l = FieldDescriptor.d("appExitInfo");

        private CrashlyticsReportEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, crashlyticsReport.l());
            objectEncoderContext.k(c, crashlyticsReport.h());
            objectEncoderContext.c(d, crashlyticsReport.k());
            objectEncoderContext.k(e, crashlyticsReport.i());
            objectEncoderContext.k(f, crashlyticsReport.g());
            objectEncoderContext.k(g, crashlyticsReport.d());
            objectEncoderContext.k(h, crashlyticsReport.e());
            objectEncoderContext.k(i, crashlyticsReport.f());
            objectEncoderContext.k(j, crashlyticsReport.m());
            objectEncoderContext.k(k, crashlyticsReport.j());
            objectEncoderContext.k(l, crashlyticsReport.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {
        public static final CrashlyticsReportFilesPayloadEncoder a = new CrashlyticsReportFilesPayloadEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("files");
        public static final FieldDescriptor c = FieldDescriptor.d("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, filesPayload.b());
            objectEncoderContext.k(c, filesPayload.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {
        public static final CrashlyticsReportFilesPayloadFileEncoder a = new CrashlyticsReportFilesPayloadFileEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("filename");
        public static final FieldDescriptor c = FieldDescriptor.d("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, file.c());
            objectEncoderContext.k(c, file.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {
        public static final CrashlyticsReportSessionApplicationEncoder a = new CrashlyticsReportSessionApplicationEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("identifier");
        public static final FieldDescriptor c = FieldDescriptor.d("version");
        public static final FieldDescriptor d = FieldDescriptor.d("displayVersion");
        public static final FieldDescriptor e = FieldDescriptor.d("organization");
        public static final FieldDescriptor f = FieldDescriptor.d("installationUuid");
        public static final FieldDescriptor g = FieldDescriptor.d("developmentPlatform");
        public static final FieldDescriptor h = FieldDescriptor.d("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, application.e());
            objectEncoderContext.k(c, application.h());
            objectEncoderContext.k(d, application.d());
            objectEncoderContext.k(e, application.g());
            objectEncoderContext.k(f, application.f());
            objectEncoderContext.k(g, application.b());
            objectEncoderContext.k(h, application.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {
        public static final CrashlyticsReportSessionApplicationOrganizationEncoder a = new CrashlyticsReportSessionApplicationOrganizationEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, organization.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {
        public static final CrashlyticsReportSessionDeviceEncoder a = new CrashlyticsReportSessionDeviceEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("arch");
        public static final FieldDescriptor c = FieldDescriptor.d("model");
        public static final FieldDescriptor d = FieldDescriptor.d("cores");
        public static final FieldDescriptor e = FieldDescriptor.d("ram");
        public static final FieldDescriptor f = FieldDescriptor.d("diskSpace");
        public static final FieldDescriptor g = FieldDescriptor.d("simulator");
        public static final FieldDescriptor h = FieldDescriptor.d("state");
        public static final FieldDescriptor i = FieldDescriptor.d(C3209Hz.z);
        public static final FieldDescriptor j = FieldDescriptor.d("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.c(b, device.b());
            objectEncoderContext.k(c, device.f());
            objectEncoderContext.c(d, device.c());
            objectEncoderContext.b(e, device.h());
            objectEncoderContext.b(f, device.d());
            objectEncoderContext.a(g, device.j());
            objectEncoderContext.c(h, device.i());
            objectEncoderContext.k(i, device.e());
            objectEncoderContext.k(j, device.g());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {
        public static final CrashlyticsReportSessionEncoder a = new CrashlyticsReportSessionEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("generator");
        public static final FieldDescriptor c = FieldDescriptor.d("identifier");
        public static final FieldDescriptor d = FieldDescriptor.d("appQualitySessionId");
        public static final FieldDescriptor e = FieldDescriptor.d("startedAt");
        public static final FieldDescriptor f = FieldDescriptor.d("endedAt");
        public static final FieldDescriptor g = FieldDescriptor.d("crashed");
        public static final FieldDescriptor h = FieldDescriptor.d(FirebaseMessaging.r);
        public static final FieldDescriptor i = FieldDescriptor.d("user");
        public static final FieldDescriptor j = FieldDescriptor.d(BU0.f);
        public static final FieldDescriptor k = FieldDescriptor.d("device");
        public static final FieldDescriptor l = FieldDescriptor.d("events");
        public static final FieldDescriptor m = FieldDescriptor.d("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, session.g());
            objectEncoderContext.k(c, session.j());
            objectEncoderContext.k(d, session.c());
            objectEncoderContext.b(e, session.l());
            objectEncoderContext.k(f, session.e());
            objectEncoderContext.a(g, session.n());
            objectEncoderContext.k(h, session.b());
            objectEncoderContext.k(i, session.m());
            objectEncoderContext.k(j, session.k());
            objectEncoderContext.k(k, session.d());
            objectEncoderContext.k(l, session.f());
            objectEncoderContext.c(m, session.h());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {
        public static final CrashlyticsReportSessionEventApplicationEncoder a = new CrashlyticsReportSessionEventApplicationEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("execution");
        public static final FieldDescriptor c = FieldDescriptor.d("customAttributes");
        public static final FieldDescriptor d = FieldDescriptor.d("internalKeys");
        public static final FieldDescriptor e = FieldDescriptor.d(C3771Nr1.A.C);
        public static final FieldDescriptor f = FieldDescriptor.d("currentProcessDetails");
        public static final FieldDescriptor g = FieldDescriptor.d("appProcessDetails");
        public static final FieldDescriptor h = FieldDescriptor.d("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, application.f());
            objectEncoderContext.k(c, application.e());
            objectEncoderContext.k(d, application.g());
            objectEncoderContext.k(e, application.c());
            objectEncoderContext.k(f, application.d());
            objectEncoderContext.k(g, application.b());
            objectEncoderContext.c(h, application.h());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        public static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder a = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("baseAddress");
        public static final FieldDescriptor c = FieldDescriptor.d("size");
        public static final FieldDescriptor d = FieldDescriptor.d("name");
        public static final FieldDescriptor e = FieldDescriptor.d("uuid");

        private CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, binaryImage.b());
            objectEncoderContext.b(c, binaryImage.d());
            objectEncoderContext.k(d, binaryImage.c());
            objectEncoderContext.k(e, binaryImage.f());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {
        public static final CrashlyticsReportSessionEventApplicationExecutionEncoder a = new CrashlyticsReportSessionEventApplicationExecutionEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("threads");
        public static final FieldDescriptor c = FieldDescriptor.d("exception");
        public static final FieldDescriptor d = FieldDescriptor.d("appExitInfo");
        public static final FieldDescriptor e = FieldDescriptor.d("signal");
        public static final FieldDescriptor f = FieldDescriptor.d("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, execution.f());
            objectEncoderContext.k(c, execution.d());
            objectEncoderContext.k(d, execution.b());
            objectEncoderContext.k(e, execution.e());
            objectEncoderContext.k(f, execution.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        public static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder a = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("type");
        public static final FieldDescriptor c = FieldDescriptor.d(SQ0.n);
        public static final FieldDescriptor d = FieldDescriptor.d("frames");
        public static final FieldDescriptor e = FieldDescriptor.d("causedBy");
        public static final FieldDescriptor f = FieldDescriptor.d("overflowCount");

        private CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, exception.f());
            objectEncoderContext.k(c, exception.e());
            objectEncoderContext.k(d, exception.c());
            objectEncoderContext.k(e, exception.b());
            objectEncoderContext.c(f, exception.d());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        public static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder a = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("name");
        public static final FieldDescriptor c = FieldDescriptor.d("code");
        public static final FieldDescriptor d = FieldDescriptor.d("address");

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, signal.d());
            objectEncoderContext.k(c, signal.c());
            objectEncoderContext.b(d, signal.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder a = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("name");
        public static final FieldDescriptor c = FieldDescriptor.d("importance");
        public static final FieldDescriptor d = FieldDescriptor.d("frames");

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, thread.d());
            objectEncoderContext.c(c, thread.c());
            objectEncoderContext.k(d, thread.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder a = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("pc");
        public static final FieldDescriptor c = FieldDescriptor.d("symbol");
        public static final FieldDescriptor d = FieldDescriptor.d("file");
        public static final FieldDescriptor e = FieldDescriptor.d(InterfaceC8148mw2.c.R);
        public static final FieldDescriptor f = FieldDescriptor.d("importance");

        private CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, frame.e());
            objectEncoderContext.k(c, frame.f());
            objectEncoderContext.k(d, frame.b());
            objectEncoderContext.b(e, frame.d());
            objectEncoderContext.c(f, frame.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.ProcessDetails> {
        public static final CrashlyticsReportSessionEventApplicationProcessDetailsEncoder a = new CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("processName");
        public static final FieldDescriptor c = FieldDescriptor.d("pid");
        public static final FieldDescriptor d = FieldDescriptor.d("importance");
        public static final FieldDescriptor e = FieldDescriptor.d("defaultProcess");

        private CrashlyticsReportSessionEventApplicationProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, processDetails.d());
            objectEncoderContext.c(c, processDetails.c());
            objectEncoderContext.c(d, processDetails.b());
            objectEncoderContext.a(e, processDetails.e());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {
        public static final CrashlyticsReportSessionEventDeviceEncoder a = new CrashlyticsReportSessionEventDeviceEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("batteryLevel");
        public static final FieldDescriptor c = FieldDescriptor.d("batteryVelocity");
        public static final FieldDescriptor d = FieldDescriptor.d("proximityOn");
        public static final FieldDescriptor e = FieldDescriptor.d("orientation");
        public static final FieldDescriptor f = FieldDescriptor.d("ramUsed");
        public static final FieldDescriptor g = FieldDescriptor.d("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, device.b());
            objectEncoderContext.c(c, device.c());
            objectEncoderContext.a(d, device.g());
            objectEncoderContext.c(e, device.e());
            objectEncoderContext.b(f, device.f());
            objectEncoderContext.b(g, device.d());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {
        public static final CrashlyticsReportSessionEventEncoder a = new CrashlyticsReportSessionEventEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("timestamp");
        public static final FieldDescriptor c = FieldDescriptor.d("type");
        public static final FieldDescriptor d = FieldDescriptor.d(FirebaseMessaging.r);
        public static final FieldDescriptor e = FieldDescriptor.d("device");
        public static final FieldDescriptor f = FieldDescriptor.d("log");
        public static final FieldDescriptor g = FieldDescriptor.d("rollouts");

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, event.f());
            objectEncoderContext.k(c, event.g());
            objectEncoderContext.k(d, event.b());
            objectEncoderContext.k(e, event.c());
            objectEncoderContext.k(f, event.d());
            objectEncoderContext.k(g, event.e());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {
        public static final CrashlyticsReportSessionEventLogEncoder a = new CrashlyticsReportSessionEventLogEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, log.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment> {
        public static final CrashlyticsReportSessionEventRolloutAssignmentEncoder a = new CrashlyticsReportSessionEventRolloutAssignmentEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("rolloutVariant");
        public static final FieldDescriptor c = FieldDescriptor.d(RolloutAssignment.c);
        public static final FieldDescriptor d = FieldDescriptor.d(RolloutAssignment.d);
        public static final FieldDescriptor e = FieldDescriptor.d("templateVersion");

        private CrashlyticsReportSessionEventRolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, rolloutAssignment.d());
            objectEncoderContext.k(c, rolloutAssignment.b());
            objectEncoderContext.k(d, rolloutAssignment.c());
            objectEncoderContext.b(e, rolloutAssignment.e());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {
        public static final CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder a = new CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("rolloutId");
        public static final FieldDescriptor c = FieldDescriptor.d("variantId");

        private CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, rolloutVariant.b());
            objectEncoderContext.k(c, rolloutVariant.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutsState> {
        public static final CrashlyticsReportSessionEventRolloutsStateEncoder a = new CrashlyticsReportSessionEventRolloutsStateEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("assignments");

        private CrashlyticsReportSessionEventRolloutsStateEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.RolloutsState rolloutsState, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, rolloutsState.b());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {
        public static final CrashlyticsReportSessionOperatingSystemEncoder a = new CrashlyticsReportSessionOperatingSystemEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("platform");
        public static final FieldDescriptor c = FieldDescriptor.d("version");
        public static final FieldDescriptor d = FieldDescriptor.d("buildVersion");
        public static final FieldDescriptor e = FieldDescriptor.d("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.c(b, operatingSystem.c());
            objectEncoderContext.k(c, operatingSystem.d());
            objectEncoderContext.k(d, operatingSystem.b());
            objectEncoderContext.a(e, operatingSystem.e());
        }
    }

    /* loaded from: classes3.dex */
    public static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {
        public static final CrashlyticsReportSessionUserEncoder a = new CrashlyticsReportSessionUserEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, user.b());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void a(EncoderConfig<?> encoderConfig) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.a;
        encoderConfig.b(CrashlyticsReport.class, crashlyticsReportEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.a;
        encoderConfig.b(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.a;
        encoderConfig.b(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.a;
        encoderConfig.b(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventApplicationProcessDetailsEncoder crashlyticsReportSessionEventApplicationProcessDetailsEncoder = CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportSessionEventRolloutsStateEncoder crashlyticsReportSessionEventRolloutsStateEncoder = CrashlyticsReportSessionEventRolloutsStateEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentEncoder crashlyticsReportSessionEventRolloutAssignmentEncoder = CrashlyticsReportSessionEventRolloutAssignmentEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder = CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.a;
        encoderConfig.b(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.a;
        encoderConfig.b(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.a;
        encoderConfig.b(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        encoderConfig.b(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}

package com.dji.sample.control.service.impl;

import com.dji.sample.control.model.enums.CameraStateEnum;
import com.dji.sample.control.model.param.DronePayloadParam;

/**
 * @author sean
 * @version 1.4
 * @date 2023/4/23
 */
public class CameraRecordingStopImpl extends PayloadCommandsHandler {

    public CameraRecordingStopImpl(DronePayloadParam param) {
        super(param);
    }

    @Override
    public boolean canPublish(String deviceSn) {
        super.canPublish(deviceSn);
        return CameraStateEnum.WORKING == osdCamera.getRecordingState();
    }
}

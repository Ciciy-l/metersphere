package io.metersphere.plan.dto.request;

import io.metersphere.system.dto.sdk.BasePageRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class TestPlanTableRequest extends BasePageRequest {
    @Schema(description = "模块ID(根据模块树查询时要把当前节点以及子节点都放在这里。)")
    private List<String> moduleIds;

    @Schema(description = "项目ID")
    @NotBlank(message = "{id must not be blank}")
    private String projectId;

    public TestPlanTableRequest() {
        this.setCurrent(1);
        this.setPageSize(5);
    }
}

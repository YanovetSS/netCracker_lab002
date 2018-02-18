<div class="row">
    <div class="form-group col-md-12">
        <label class="col-md-3 control-lable" for="object">Roles</label>
        <div class="col-md-7">
            <form:select path="object" items="${objects}" multiple="true" itemValue="objectId" itemLabel="object" class="form-control input-sm" />
            <div class="has-error">
                <form:errors path="object" class="help-inline"/>
            </div>
        </div>
    </div>
</div>
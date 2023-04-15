package net.mcreator.darkinfection.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelnevkarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dark_infection", "modelnevkarmor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Rightboot;
	public final ModelPart leftboot;

	public Modelnevkarmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Rightboot = root.getChild("Rightboot");
		this.leftboot = root.getChild("leftboot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(55, 5).addBox(2.0F, -10.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 5).addBox(2.0F, -10.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 5)
						.addBox(2.0F, -10.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 5).addBox(2.0F, -10.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(55, 5).addBox(-3.0F, -10.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 5).addBox(-3.0F, -10.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 5)
						.addBox(-3.0F, -10.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 5).addBox(-3.0F, -10.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 3).addBox(-2.5F, -10.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 3)
				.addBox(-0.5F, -10.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 3).addBox(1.5F, -10.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 3).addBox(1.5F, -10.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 3)
				.addBox(-2.5F, -10.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 3).addBox(-0.5F, -12.0F, -4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 6).addBox(3.0F, -8.0F, -3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0361F, -0.3911F, -0.0944F));
		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(40, 6).addBox(3.0F, -6.5F, -3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 6).addBox(3.0F, -5.0F, -3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0181F, -0.3923F, -0.0472F));
		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 6).addBox(-8.0F, -8.0F, -3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0181F, 0.3923F, 0.1417F));
		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(40, 6).addBox(-8.0F, -6.7F, -3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 6).addBox(-8.0F, -5.0F, -3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0181F, 0.3923F, 0.0472F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 5).addBox(-1.0F, 0.0F, -2.25F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 5)
						.addBox(-3.0F, 10.0F, -2.25F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 5).addBox(-4.25F, 11.0F, -2.25F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 5)
						.addBox(2.25F, 11.0F, -2.25F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 5).addBox(-3.0F, 10.0F, -1.75F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 5)
						.addBox(-2.0F, 0.0F, 1.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 5).addBox(-4.25F, 11.0F, -1.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 5)
						.addBox(2.25F, 11.0F, -1.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 1).addBox(-4.25F, 0.0F, -2.25F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 1)
						.addBox(-4.25F, 9.0F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 1).addBox(-4.25F, 0.0F, -1.75F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 1)
						.addBox(-4.25F, 9.0F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 1).addBox(2.25F, 0.0F, -2.25F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 1)
						.addBox(3.25F, 9.0F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 1).addBox(2.25F, 0.0F, -1.75F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 1)
						.addBox(3.25F, 9.0F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, 0.75F, -7.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3054F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(44, 8).addBox(-2.0F, 0.75F, -7.45F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.4363F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(44, 8).addBox(-2.0F, 0.75F, 2.3F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.4363F));
		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 39).addBox(-1.0F, 0.75F, 3.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.3054F));
		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 4).addBox(-3.25F, -2.0F, -2.25F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 4)
						.addBox(-3.25F, -2.0F, -1.75F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 4).addBox(-3.25F, 1.0F, -1.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 4)
						.addBox(-3.25F, 1.0F, -2.25F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 3).addBox(-0.75F, -2.0F, -2.25F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 3)
						.addBox(1.25F, 1.0F, -2.25F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 3).addBox(1.25F, 1.0F, -1.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 3)
						.addBox(-0.75F, -2.0F, -1.75F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.2F, 0.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-0.95F, 4.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-0.95F, 4.0F, 1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.8F, 0.0F, -1.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.8F, 4.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-2.2F, 4.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.2F, 0.0F, -1.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.8F, 0.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.25F, 0.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, 4.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, 4.0F, 1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.75F, 0.0F, -1.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.75F, 4.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-2.25F, 4.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.25F, 0.0F, -1.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.75F, 0.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition Rightboot = partdefinition.addOrReplaceChild("Rightboot",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.2F, 8.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.8F, 8.0F, -1.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.2F, 8.0F, -1.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.8F, 8.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(1.2F, 7.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-2.2F, 7.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(1.2F, 7.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-2.2F, 7.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition leftboot = partdefinition.addOrReplaceChild("leftboot",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.25F, 8.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.75F, 8.0F, -1.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.25F, 8.0F, -1.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.75F, 8.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(1.25F, 7.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-2.25F, 7.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(1.25F, 7.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-2.25F, 7.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightboot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftboot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
